package com.wuzx.fun.zuul_gateway_9527.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.RequestContent;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

/**
 * @program: springcloud_parent->LoginFilter
 * @description: 登录鉴权过滤器
 * @author: wuzx
 * @create: 2019-08-30 14:13
 * @version: 1.0
 **/
@Component
public class LoginFilter extends ZuulFilter {

    /**
     * 过滤器类型前置
     * @return
     */
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    /**
     * 顺序，值越小越先执行
     * @return
     */
    @Override
    public int filterOrder() {
        return 4;
    }

    /**
     * 过滤器是否生效
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        System.out.println();
        System.out.println(request.getRequestURL());

        if (request.getRequestURI().startsWith("/wuzx/product/api")) {
            return true;
        }
        return false;
    }

    /**
     * 业务逻辑
     *
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        //登录校验逻辑
        String token = request.getHeader("token");
        if (StringUtils.isBlank(token)) {
            requestContext.setSendZuulResponse(false);//阻断
            requestContext.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);

        }

        return null;
    }
}

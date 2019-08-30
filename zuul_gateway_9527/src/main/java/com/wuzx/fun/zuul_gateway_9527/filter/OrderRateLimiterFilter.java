package com.wuzx.fun.zuul_gateway_9527.filter;

import com.google.common.util.concurrent.RateLimiter;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @program: springcloud_parent->RateLimiterFilter
 * @description: 限流
 * @author: wuzx
 * @create: 2019-08-30 16:35
 * @version: 1.0
 **/
public class OrderRateLimiterFilter extends ZuulFilter {
    //每秒产生1000个令牌
    private final RateLimiter RATE_LIMITER = RateLimiter.create(100);

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return -4;
    }

    @Override
    public boolean shouldFilter() {

        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        if (request.getRequestURI().startsWith("/wuzx/product/api")) {
            return true;
        }
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        //阻塞获取一个令牌}
        if (!RATE_LIMITER.tryAcquire()) {
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(HttpStatus.TOO_MANY_REQUESTS.value());
        }


            return null;
        }
}

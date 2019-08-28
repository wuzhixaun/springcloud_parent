package com.wuzx.fun.order_service_9002.controller;

import com.wuzx.fun.commonapi.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @program: springcloud_parent->OrderController
 * @description:
 * @author: wuzx
 * @create: 2019-08-28 16:26
 * @version: 1.0
 **/

@RestController
@RequestMapping(value = {"/api/order"})
public class OrderController {

    //微服务名称
    private static final String REST_URL_PREFIX = "http://PRODUCT-SERVICE"; //切记不要用下划线，真得好坑

    @Autowired

    private RestTemplate restTemplate;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Product> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/api/product/list", List.class);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable int id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/api/product/get/" + id, Product.class);
    }
}

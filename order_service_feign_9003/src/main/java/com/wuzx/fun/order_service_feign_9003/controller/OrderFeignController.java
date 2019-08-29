package com.wuzx.fun.order_service_feign_9003.controller;

import com.wuzx.fun.commonapi.domain.Product;
import com.wuzx.fun.commonapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springcloud_parent->OrderFeignController
 * @description:
 * @author: wuzx
 * @create: 2019-08-29 16:54
 * @version: 1.0
 **/
@RestController
@RequestMapping(value = "/order/feign")
public class OrderFeignController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/list")
    public List<Product> list() {
       return productService.list();
    }

    @RequestMapping(value = "/get/{id}")
    public Product get(@PathVariable int id) {
        return productService.get(id);
    }
}

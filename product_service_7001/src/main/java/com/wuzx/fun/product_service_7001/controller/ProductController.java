package com.wuzx.fun.product_service_7001.controller;


import com.wuzx.fun.commonapi.domain.Product;
import com.wuzx.fun.product_service_7001.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/api/product"})
@RefreshScope//声明这例可以刷新
public class ProductController {

    @Value("${server.port}")
    String port;

    @Value("${env}")
    String env;
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable int id) {
        System.out.println(port+env);
        return productService.get(id);
    }
}

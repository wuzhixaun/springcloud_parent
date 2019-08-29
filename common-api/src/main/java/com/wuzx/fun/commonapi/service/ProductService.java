package com.wuzx.fun.commonapi.service;


import com.wuzx.fun.commonapi.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "product-service")
public interface ProductService {

    @RequestMapping(value = "/api/product/list", method = RequestMethod.GET)
    public List<Product> list();

    @RequestMapping(value = "/api/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable int id);
}

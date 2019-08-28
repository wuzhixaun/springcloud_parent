package com.wuzx.fun.product_service_7002.service;

import com.wuzx.fun.commonapi.domain.Product;

import java.util.List;

public interface ProductService {

    public List<Product> list();

    public Product get(int id);

}

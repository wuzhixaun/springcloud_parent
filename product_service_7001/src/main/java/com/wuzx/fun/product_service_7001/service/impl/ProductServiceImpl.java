package com.wuzx.fun.product_service_7001.service.impl;

import com.wuzx.fun.commonapi.domain.Product;
import com.wuzx.fun.product_service_7001.dao.ProductDao;
import com.wuzx.fun.product_service_7001.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> list() {
        return productDao.list();
    }

    @Override
    public Product get(int id) {
        return productDao.get(id);
    }

}

package com.wuzx.fun.product_service_7002.dao;

import com.wuzx.fun.commonapi.domain.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductDao {
    public List<Product> list();

    public Product get(int id);
}

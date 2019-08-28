package com.wuzx.fun.commonapi.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {
    private int id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 价格，分为单位
     */
    private int price;


    /**
     * 库存
     */
    private int store;

    /**
     * 数据源
     */
    private String db_sourse;

}

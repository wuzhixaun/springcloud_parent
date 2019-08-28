package com.wuzx.fun.commonapi.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: order_service->ProductOrder
 * @description: 订单
 * @author: wuzx
 * @create: 2019-08-26 17:43
 * @version: 1.0
 **/
@Data
public class ProductOrder implements Serializable {


    private int id;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 订单号
     */
    private  String tradeNo;

    /**
     * 价格,分
     */
    private int price;


    private Date createTime;


    private int userId;

    private String userName;

}

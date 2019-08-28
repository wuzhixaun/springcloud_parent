package com.wuzx.fun.order_service_9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClients(value = {
//
//        //@RibbonClient(name = "")
//})
@RibbonClient(name = "PRODUCT-SERVICE")
public class OrderService9001Application {

    public static void main(String[] args) {
        SpringApplication.run(OrderService9001Application.class, args);
    }

}

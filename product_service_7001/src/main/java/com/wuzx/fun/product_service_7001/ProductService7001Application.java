package com.wuzx.fun.product_service_7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
public class ProductService7001Application {

    public static void main(String[] args) {
        SpringApplication.run(ProductService7001Application.class, args);
    }

}

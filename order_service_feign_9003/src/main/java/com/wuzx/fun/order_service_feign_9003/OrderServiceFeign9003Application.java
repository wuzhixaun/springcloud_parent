package com.wuzx.fun.order_service_feign_9003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.wuzx.fun.commonapi.service")
public class OrderServiceFeign9003Application {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceFeign9003Application.class, args);
    }

}

package com.wuzx.fun.zuul_gateway_9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway9527Application.class, args);
    }

}

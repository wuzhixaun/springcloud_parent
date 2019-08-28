package com.wuzx.fun.eureka_server_8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8002Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8002Application.class, args);
    }

}

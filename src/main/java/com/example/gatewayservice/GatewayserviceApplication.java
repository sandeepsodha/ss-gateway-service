package com.example.gatewayservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayserviceApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder()
                .profiles("prod")
                .sources(GatewayserviceApplication.class)
                .run(args);
    }

}

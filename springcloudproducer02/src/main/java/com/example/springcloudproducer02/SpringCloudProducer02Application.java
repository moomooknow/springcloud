package com.example.springcloudproducer02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wangfk
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudProducer02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProducer02Application.class, args);
    }

}

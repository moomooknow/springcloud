package com.example.springcloudconsumer02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wangfk
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudConsumer02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumer02Application.class, args);
    }

}

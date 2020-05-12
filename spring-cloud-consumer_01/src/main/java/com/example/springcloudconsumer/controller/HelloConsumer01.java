package com.example.springcloudconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangfk
 */
@RestController
public class HelloConsumer01 {

    @Autowired
    private LoadBalancerClient client;
    
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/helloConsumer01")
    public String hello(@RequestParam String name) {
        name += "01";
        ServiceInstance instance = client.choose("spring-cloud-producer");
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/hello/?name=" + name;
        return restTemplate.getForObject(url, String.class);
    }
}

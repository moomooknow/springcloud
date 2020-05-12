package com.example.springcloudconsumer02.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangfk
 */
@FeignClient(name = "spring-cloud-producer")
public interface HelloRemote {
    /**
     * Feign 调用实现 
     * 此类中的方法和远程服务中controller中的方法名和参数需保持一致
     * @param name 
     * @return
     */
    @RequestMapping("/hello")
    String hello(@RequestParam(value = "name") String name);
}

package com.example.springcloudconsumer02.controller;

import com.example.springcloudconsumer02.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangfk
 */
@RestController
public class HelloConsumer02 {
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/helloConsumer02/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name+"02");
    }
}

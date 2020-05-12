package com.example.springcloudconsumer02.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangfk
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" +name+", this message send failed ";
    }
}

package com.learn.springcloud.alibaba.consumer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hi/{msg}")
    public String sayHi(@PathVariable("msg") String msg){
        return restTemplate.getForObject("http://nacos-provider/hi/" + msg, String.class);
    }
}

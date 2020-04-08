package com.learn.springcloud.alibaba.consumer.feign.controller;

import com.learn.springcloud.alibaba.consumer.feign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    private HiService hiService;

    @GetMapping("/hi/{msg}")
    public String hi(@PathVariable("msg") String msg){
        return hiService.hi(msg);
    }
}

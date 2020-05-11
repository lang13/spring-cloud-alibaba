package com.learn.springcloud.alibaba.dubbo.consumer.controller;

import com.learn.dubbo.api.HiService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Reference
    private HiService hiService;

    @GetMapping("/hi/{msg}")
    public String Hi(@PathVariable String msg){
        return hiService.Hi(msg);
    }
}

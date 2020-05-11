package com.learn.springcloud.alibaba.dubbo.consumer.controller;

import com.learn.dubbo.api.HiService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HiController {

    @Reference
    private HiService hiService;

    @Value("${user.name}")
    private String username;

    @GetMapping("/hi/{msg}")
    public String Hi(@PathVariable String msg){
        return hiService.Hi(msg);
    }

    @GetMapping("/config")
    public String config(){
        return "配置里user.name的值是: " + username;
    }
}

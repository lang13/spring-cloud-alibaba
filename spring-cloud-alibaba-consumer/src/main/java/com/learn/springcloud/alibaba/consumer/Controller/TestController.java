package com.learn.springcloud.alibaba.consumer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RefreshScope //配置实时生效, 刷新容器里bean的值
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.name}")
    private String username;

    @GetMapping("/hi/{msg}")
    public String sayHi(@PathVariable("msg") String msg){
        return restTemplate.getForObject("http://nacos-provider/hi/" + msg, String.class);
    }

    @GetMapping("/hi")
    public String sayHi(){
        return "username是: " + username;
    }
}

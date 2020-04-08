package com.learn.springcloud.alibaba.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class  SpringCloudAlibabaProviderApplication {

    @Value("${server.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaProviderApplication.class, args);
    }

    @RestController
    public class EchoController {
        @GetMapping(value = "/hi/{msg}")
        public String hi(@PathVariable("msg") String msg) {
            return "你好, "+ "这里是: "  + port + "\n你发送的信息是: " + msg;
        }
    }
}

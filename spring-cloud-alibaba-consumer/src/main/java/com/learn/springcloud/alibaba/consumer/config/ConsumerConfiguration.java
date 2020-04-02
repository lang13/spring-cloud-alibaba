package com.learn.springcloud.alibaba.consumer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsumerConfiguration {

    @Bean
    @LoadBalanced //负载均衡
   public RestTemplate restTemplate(){
       return new RestTemplate();
   }
}

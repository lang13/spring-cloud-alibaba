package com.learn.springcloud.alibaba.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider")
public interface HiService {

    @GetMapping("/hi/{msg}")
    String hi(@PathVariable("msg") String msg);
}

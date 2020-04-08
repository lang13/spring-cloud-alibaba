package com.learn.springcloud.alibaba.consumer.feign.service.fallback;

import com.learn.springcloud.alibaba.consumer.feign.service.HiService;
import org.springframework.stereotype.Component;

@Component
public class HiServiceFallback implements HiService {
    @Override
    public String hi(String msg) {
        return "发送了熔断, 接收到的msg是: " + msg;
    }
}

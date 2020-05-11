package com.learn.dubbo.service.service;

import com.learn.dubbo.api.HiService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class HiServiceImpl implements HiService {
    @Override
    public String Hi(String msg) {
        return "这里是dubbo的HiServiceImpl,\n你发送的信息是: " + msg;
    }
}

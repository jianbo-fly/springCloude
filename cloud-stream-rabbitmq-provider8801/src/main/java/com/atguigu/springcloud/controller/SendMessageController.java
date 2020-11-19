package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMyMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 18482
 */
@RestController
public class SendMessageController {
    @Resource
    private IMyMessage messageImpl;

    @GetMapping(value = "/sendMessage")
    public String sengMessage() {
        messageImpl.sendMessage();
        return "ok";
    }
}

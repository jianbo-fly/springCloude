package com.atguigu.springcloudalibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 18482
 */
@RestController
@Slf4j
public class AlibabaController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/nacos/payment/{id}")
    public String getPayment(@PathVariable("id") int id) {
        log.info("nacos 订单服务，端口号为 ：" + serverPort + "id :" + id);
        return "nacos 订单服务，端口号为 ：" + serverPort + "id :" + id;
    }
}

package com.atguigu.springcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 18482
 */
@RestController
public class ZkConsumerController {
    private static final String PROVIDER_URL = "http://cloud-provider-payment-zookeeper";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String getServerPaymentZk() {
        String result = restTemplate.getForObject(PROVIDER_URL + "/payment/zk", String.class);
        return result;
    }
}

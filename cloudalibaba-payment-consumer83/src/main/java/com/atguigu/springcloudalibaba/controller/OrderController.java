package com.atguigu.springcloudalibaba.controller;

import com.atguigu.springcloudalibaba.service.Test;
import jdk.nashorn.internal.codegen.CompilerConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 18482
 */
@RestController
@Slf4j
public class OrderController {

    @Value("${service-url.nacos-user-service}")
    private String nacosServer;

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private Test test;

    @GetMapping(value = "/consumer/payment/{id}")
    public String getPaymentInfo(@PathVariable("id") int id) {
        log.info("调用！！");
        String result = restTemplate.getForObject(nacosServer + "/nacos/payment/" + id, String.class);
        return result;
    }

    @GetMapping(value = "/test")
    public String getPaymentInfo() {

        String s = test.getName();
        log.info("********" + s);
        return s;
    }


}

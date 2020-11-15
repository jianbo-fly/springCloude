package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.HystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 18482
 */
@RestController
@Slf4j
public class HystrixController {


    @Resource
    private HystrixService hystrixService;

    @GetMapping(value = "/payment/ok/{id}")
    public String hystrixIsOk(@PathVariable("id") Integer id) {

        String result = hystrixService.hystrixIsOk(id);
        log.info("**********" + result);
        return result;
    }

    @GetMapping(value = "payment/delay/{id}")
    public String hystrixIsError(@PathVariable("id") Integer id) {
        String result = hystrixService.hystrixIsError(id);
        log.info("**********" + result);
        return result;
    }

    //===服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        String result = hystrixService.paymentCircuitBreaker(id);
        log.info("*******result:" + result);
        return result;
    }


}

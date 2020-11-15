package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.openfeign.OpenFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 18482
 */
@RestController
public class OpenFeignController {
    @Resource
    private OpenFeignService openFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return openFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/timeOut")
    public String feignTimeOut() {
        return openFeignService.paymentFeignTimeOut();
    }

}

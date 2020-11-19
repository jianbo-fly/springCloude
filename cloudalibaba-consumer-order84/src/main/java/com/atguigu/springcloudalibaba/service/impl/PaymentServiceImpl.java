package com.atguigu.springcloudalibaba.service.impl;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloudalibaba.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author 18482
 */
@Component
public class PaymentServiceImpl implements PaymentService {
    @Override
    public CommonResult paymentSql(Long id) {
        return new CommonResult(444,"服务降级返回,---PaymentFallbackService", new Payment(id,"error"));
    }
}

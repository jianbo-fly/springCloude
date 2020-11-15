package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;


/**
 * @author 18482
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);

    void feignTimeOut();
}

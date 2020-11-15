package com.atguigu.springcloud.service;


import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 18482
 */
public interface HystrixService {
    
    String hystrixIsOk(Integer id);
    
    String hystrixIsError(Integer id);

    String paymentCircuitBreaker(@PathVariable("id") Integer id);
}

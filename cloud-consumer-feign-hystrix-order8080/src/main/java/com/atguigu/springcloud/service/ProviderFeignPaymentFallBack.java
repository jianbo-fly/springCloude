package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author 18482
 */
@Component
public class ProviderFeignPaymentFallBack implements ProviderFeignPayment {
    @Override
    public String hystrixIsOk(Integer id) {
        return "服务异常 hystrixIsOk";
    }

    @Override
    public String hystrixIsError(Integer id) {
        return "服务异常 hystrixIsError";
    }
}

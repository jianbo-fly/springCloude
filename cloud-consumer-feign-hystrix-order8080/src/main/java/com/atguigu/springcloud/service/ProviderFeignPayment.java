package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 18482
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = ProviderFeignPaymentFallBack.class)
public interface ProviderFeignPayment {

    @GetMapping(value = "/payment/ok/{id}")
    String hystrixIsOk(@PathVariable("id") Integer id);

    @GetMapping(value = "payment/delay/{id}")
    String hystrixIsError(@PathVariable("id") Integer id);

}

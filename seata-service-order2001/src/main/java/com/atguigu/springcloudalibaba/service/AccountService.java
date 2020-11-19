package com.atguigu.springcloudalibaba.service;

import com.atguigu.springcloudalibaba.domain.CommonResult;
import com.atguigu.springcloudalibaba.service.impl.AccountServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author 18482
 */
@FeignClient(value = "seata-account-service",fallback = AccountServiceImpl.class)
public interface AccountService {

    @PostMapping(value = "/account/descMoney")
    CommonResult descMoney(@RequestParam(value = "userId") Long userId, @RequestParam(value = "money") BigDecimal money);
}

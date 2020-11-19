package com.atguigu.springcloudalibaba.service.impl;

import com.atguigu.springcloudalibaba.domain.CommonResult;
import com.atguigu.springcloudalibaba.service.AccountService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author 18482
 */
@Component
public class AccountServiceImpl implements AccountService {

    @Override
    public CommonResult descMoney(Long userId, BigDecimal money) {
        return new CommonResult(444, "调用用户账号信息出错！");
    }
}

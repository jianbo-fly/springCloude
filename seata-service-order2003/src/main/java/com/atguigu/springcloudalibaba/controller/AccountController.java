package com.atguigu.springcloudalibaba.controller;

import com.atguigu.springcloudalibaba.domain.CommonResult;
import com.atguigu.springcloudalibaba.service.impl.AccountServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author 18482
 */
@RestController
@Slf4j
public class AccountController {
    @Autowired
    private AccountServiceImpl accountService;

    @RequestMapping("/account/descMoney")
    public CommonResult descMoney(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountService.descMoney(userId, money);
        return new CommonResult(200, "账户金额扣除成功！");
    }
}

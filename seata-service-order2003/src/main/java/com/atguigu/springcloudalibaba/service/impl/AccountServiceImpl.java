package com.atguigu.springcloudalibaba.service.impl;

import com.atguigu.springcloudalibaba.dao.AccountDao;
import com.atguigu.springcloudalibaba.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author 18482
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    @Override
    public void descMoney(Long userId, BigDecimal money) {
        accountDao.descMoney(userId, money);
    }
}

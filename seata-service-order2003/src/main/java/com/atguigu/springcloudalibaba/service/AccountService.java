package com.atguigu.springcloudalibaba.service;

import java.math.BigDecimal;

/**
 * @author 18482
 */
public interface AccountService {
    /**
     * 扣除账户里的钱
     *
     * @param userId
     * @param money
     */
    void descMoney(Long userId, BigDecimal money);
}

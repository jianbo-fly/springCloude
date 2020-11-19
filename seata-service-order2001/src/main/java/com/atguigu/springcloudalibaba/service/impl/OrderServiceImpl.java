package com.atguigu.springcloudalibaba.service.impl;

import com.atguigu.springcloudalibaba.dao.OrderDao;
import com.atguigu.springcloudalibaba.domain.Order;
import com.atguigu.springcloudalibaba.service.AccountService;
import com.atguigu.springcloudalibaba.service.OrderService;
import com.atguigu.springcloudalibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 18482
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private AccountService accountService;
    @Resource
    private StorageService storageService;

    @Override
    @GlobalTransactional(name = "order-translational", rollbackFor = Exception.class)
    public void createOrder(Order order) {
        log.info(">>>>>>>>>>>>>>>>" + "创建订单开始！");
        orderDao.createOrder(order);
        log.info(">>>>>>>>>>>>>>>>" + "扣减库存数" + order.getCount());
        storageService.decrease(order.getProductId(), order.getCount());
        log.info(">>>>>>>>>>>>>>>>" + "扣除金额！！" + order.getMoney());
        accountService.descMoney(order.getUserId(), order.getMoney());
        log.info("修改订单状态");
        orderDao.updateOrderStatus(order.getUserId());
    }

    @Override
    public void updateOrderStatus(Long userId, Integer status) {
        orderDao.updateOrderStatus(userId);
    }
}

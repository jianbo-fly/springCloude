package com.atguigu.springcloudalibaba.service;

import com.atguigu.springcloudalibaba.domain.Order;

/**
 * @author 18482
 */
public interface OrderService {

    void createOrder(Order order);

    void updateOrderStatus(Long userId, Integer status);
}

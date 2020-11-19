package com.atguigu.springcloudalibaba.dao;

import com.atguigu.springcloudalibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 18482
 */
@Mapper
public interface OrderDao {

    void createOrder(Order order);

    void updateOrderStatus(Long userId);

}

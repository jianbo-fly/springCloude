package com.atguigu.springcloudalibaba.controller;

import com.atguigu.springcloudalibaba.domain.CommonResult;
import com.atguigu.springcloudalibaba.domain.Order;
import com.atguigu.springcloudalibaba.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 18482
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @PostMapping("/order")
    public CommonResult createOrder( Order order) {
        orderService.createOrder(order);
        return new CommonResult(200, "创建订单成功！");
    }
}

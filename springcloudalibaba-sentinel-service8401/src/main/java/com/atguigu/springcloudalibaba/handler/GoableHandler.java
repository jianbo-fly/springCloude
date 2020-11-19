package com.atguigu.springcloudalibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @author 18482
 */
public class GoableHandler {

    public static CommonResult handlerMethod1(BlockException e) {
        return new CommonResult(444, "异常处理方法1 + serical1");
    }

    public static CommonResult handlerMethod2(BlockException e) {
        return new CommonResult(444, "异常处理方法2 + serical2");
    }
}

package com.atguigu.springcloudalibaba.service.impl;

import com.atguigu.springcloudalibaba.domain.CommonResult;
import com.atguigu.springcloudalibaba.service.StorageService;
import org.springframework.stereotype.Component;

/**
 * @author 18482
 */
@Component
public class StorageServiceImpl implements StorageService {
    @Override
    public CommonResult decrease(Long productId, Integer count) {
        return new CommonResult(444, "调用库存信息出错！");
    }
}

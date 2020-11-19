package com.atguigu.springcloudalibaba.service;

import com.atguigu.springcloudalibaba.domain.CommonResult;
import com.atguigu.springcloudalibaba.service.impl.StorageServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 18482
 */
@FeignClient(value = "seata-storage-service", fallback = StorageServiceImpl.class)
public interface StorageService {
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}



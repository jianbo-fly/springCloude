package com.atguigu.springcloudalibaba.service;

import com.atguigu.springcloudalibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;

public interface StorageService {

    CommonResult descStorage(Long productId, Integer count);

}

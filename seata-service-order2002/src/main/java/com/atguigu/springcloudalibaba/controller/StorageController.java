package com.atguigu.springcloudalibaba.controller;

import com.atguigu.springcloudalibaba.domain.CommonResult;
import com.atguigu.springcloudalibaba.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 18482
 */
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        return storageService.descStorage(productId, count);
    }
}

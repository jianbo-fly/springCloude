package com.atguigu.springcloudalibaba.service.impl;

import com.atguigu.springcloudalibaba.dao.StorageDao;
import com.atguigu.springcloudalibaba.domain.CommonResult;
import com.atguigu.springcloudalibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 18482
 */
@Service
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;

    @Override
    public CommonResult descStorage(Long productId, Integer count) {
        storageDao.descStorage(productId, count);
        return new CommonResult(200, "成功");
    }
}

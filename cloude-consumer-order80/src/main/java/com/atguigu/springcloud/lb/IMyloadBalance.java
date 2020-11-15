package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author 18482
 */
public interface IMyloadBalance {

    ServiceInstance instance(List<ServiceInstance> serviceInstanceList);
}

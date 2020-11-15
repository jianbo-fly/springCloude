package com.atguigu.springcloud.lb.impl;

import com.atguigu.springcloud.lb.IMyloadBalance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 18482
 */
@Component
public class MyloadBalanceImpl implements IMyloadBalance {


    AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 参考RoundRobinRule 类的源码实现 自定义选择规则
     *
     * @return
     */
    public final int getAndIncrement() {
        int previous;
        int next;
        do {
            previous = atomicInteger.get();
            next = previous >= Integer.MAX_VALUE ? 0 : previous + 1;
        } while (!this.atomicInteger.compareAndSet(previous, next));
        System.out.println("---------第几次访问,次数:next=" + next);
        return next;
    }

    /**
     * 负载均衡算法: rest接口第几次请求数%服务器集群总数量=实际调用服务器位置下标.每次服务重启动后rest接口计数从1开始。
     *
     * @param
     * @return
     */
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstanceList) {
        int index = getAndIncrement() % serviceInstanceList.size();
        return serviceInstanceList.get(index);
    }
}

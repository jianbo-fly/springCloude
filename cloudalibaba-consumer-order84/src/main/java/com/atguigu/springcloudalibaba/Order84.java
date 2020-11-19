package com.atguigu.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 18482
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Order84 {
    public static void main(String[] args) {
        SpringApplication.run(Order84.class, args);
    }
}

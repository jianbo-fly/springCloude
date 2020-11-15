package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 18482
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class FeignHystrixMain8080 {
    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixMain8080.class, args);
    }
}

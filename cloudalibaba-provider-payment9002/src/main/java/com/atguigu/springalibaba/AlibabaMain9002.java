package com.atguigu.springalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 18482
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaMain9002.class, args);
    }
}

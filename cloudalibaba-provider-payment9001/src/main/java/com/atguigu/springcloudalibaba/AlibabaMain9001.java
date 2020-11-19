package com.atguigu.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 18482
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaMain9001.class, args);
    }
}

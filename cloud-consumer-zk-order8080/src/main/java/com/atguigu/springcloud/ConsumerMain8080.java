package com.atguigu.springcloud;

import com.atguigu.irule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 18482
 */
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "cloud-payment-service", configuration = MyRule.class)
public class ConsumerMain8080 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain8080.class, args);
    }
}

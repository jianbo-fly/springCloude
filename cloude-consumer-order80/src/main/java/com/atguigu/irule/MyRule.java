package com.atguigu.irule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 18482
 */
@Configuration
public class MyRule {
    @Bean
    public IRule getMyRule() {
        return new RandomRule();
    }
}
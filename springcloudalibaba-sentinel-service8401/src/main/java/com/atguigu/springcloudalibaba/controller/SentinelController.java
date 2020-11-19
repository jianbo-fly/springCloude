package com.atguigu.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author 18482
 */
@Slf4j
@RestController
public class SentinelController {
    @GetMapping("/testA")
    public String testA() {

        return "--------TestA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "-----testB";
    }

    @GetMapping("/testE")
    public String testE() {
        Random random = new Random();
        int intValue = random.nextInt(10);
        if (intValue >= 2) {
            log.info("异常！" + intValue);
            int c = 10 / 0;
            return "异常";
        } else {
            log.info("正常" + intValue);
            return "正常！！" + intValue;
        }
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "hot_method")  //blockHandler  这里配置的方法只是生效于 sentinel 热点规则中的配置
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1
            , @RequestParam(value = "p2", required = false) String p2) {
        //int a = 10 / 0;  //这里如果上面只是配置了   blockHandler =  那么页面出现错误，因为blockHandler 只监控 sentinel页面配置
        return "-------------testHotKey";
    }

    public String hot_method(String p1, String p2, BlockException e) {
        return "sentinel 配置出错 ！+ o(╥﹏╥)o";
    }
}

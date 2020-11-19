package com.atguigu.springcloudalibaba.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Test {
    private int name;
    private Test1 test1;

    Test() {
    log.info( "%%%%%%%%%%%%%%%%%"  +"调用无惨构造函数！！");
        }
    Test(Test1 name) {
        this.test1 = name;
    }

    public String getName() {
        return test1.getS();
    }

}

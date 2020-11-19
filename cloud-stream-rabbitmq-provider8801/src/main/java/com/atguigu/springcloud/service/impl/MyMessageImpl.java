package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.IMyMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author 18482
 */
@EnableBinding(Source.class)  //绑定消息
@Slf4j
public class MyMessageImpl implements IMyMessage {
    //消息发送管道
/*    @Autowired
    @Qualifier(Source.OUTPUT)*/
    @Resource
    private MessageChannel output;

    @Override
    public String sendMessage() {
        String uuidMessage = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(uuidMessage).build());
        log.info("**********: " + uuidMessage);
        return null;
    }
}

package com.atguigu.springcloud.service;

/**
 * @author 18482
 */
public interface IMyMessage {
    /**
     * 通过rabbitmq 发送消息的接口
     * @return
     */

    String sendMessage();
}

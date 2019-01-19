package com.tensquare.user.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName Consumer
 * @auther tangh
 * @date 2019/1/18 0018 15:42
 */
@Component
@RabbitListener(queues = "tangh")
public class Consumer {

    @RabbitHandler
    public void listener1(String message){
        System.out.println(message);
    }

}

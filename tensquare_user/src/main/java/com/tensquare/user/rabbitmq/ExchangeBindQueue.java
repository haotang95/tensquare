package com.tensquare.user.rabbitmq;

import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName ExchangeBindQueue
 * @auther tangh
 * @date 2019/1/18 0018 17:18
 */
@Component
public class ExchangeBindQueue {

    @RabbitListener(bindings = {@QueueBinding(value = @Queue("tensquare.test.user.q"),
                                                exchange = @Exchange("tensquare.exchange.ex"), key = "tensquare.a")
                                ,@QueueBinding(value = @Queue("tensquare.user.message.q"),
                                                exchange = @Exchange("tensquare.exchange.ex"), key = "tensquare.a")})
    @RabbitHandler
    public void consumer1(String message){
        System.out.println(message);
    }


}

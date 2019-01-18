package com.tensquare.user.controller;

import org.junit.Test;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @auther tangh
 * @date 2019/1/18 0018 14:46
 */
@RestController
@CrossOrigin
@RequestMapping("user")
@RabbitListener(queues = "tangh")
public class UserController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("send")
    @Test
    public void testSend(){
        rabbitTemplate.convertAndSend("tangh","i love life");
    }


    @RabbitHandler
    public void testGet(String message){
        System.out.println(message);
    }

}

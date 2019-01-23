package com.tensquare.user.controller;

import com.tensquare.user.feign.BaseClient;
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
public class UserController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private BaseClient baseClient;

    @GetMapping("send")
    public void testSend(){
        rabbitTemplate.convertAndSend("tensquare.exchange.ex","tensquare.a", String.valueOf(baseClient.get().getData()));
    }


}

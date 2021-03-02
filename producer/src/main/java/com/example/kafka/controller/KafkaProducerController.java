package com.example.kafka.controller;

import kafka.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/kafka/")
public class KafkaProducerController {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    @GetMapping("send")
    @ResponseBody
    public boolean send(User user) {
        try {
            kafkaTemplate.send("testTopic", user);
            System.out.println("testTopic消息发送成功...:"+ user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }

    @GetMapping("send2")
    @ResponseBody
    public boolean send(User user) {
        try {
            kafkaTemplate.send("testTopic2", user);
            System.out.println("testTopic2消息发送成功...:"+ user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }

    @GetMapping("test")
    @ResponseBody
    public String test(){
        System.out.println("hello world!");
        return "ok";
    }
}

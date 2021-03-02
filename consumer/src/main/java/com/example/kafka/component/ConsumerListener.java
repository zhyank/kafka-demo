package com.example.kafka.component;

import kafka.entity.User;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    // 包含消息的更多信息的消费
    @KafkaListener(topics = "testTopic2")
    public void consumer(ConsumerRecord<String, User> record, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic, Consumer consumer) {

      //  public void onMessage(User message){
        //insertIntoDb(buffer);//这里为插入数据库代码
        System.out.println(record.value());
        System.out.println("message: " + record);
    }


    @KafkaListener(topics = "testTopic")
    public void consumer(User record) {

        //  public void onMessage(User message){
        //insertIntoDb(buffer);//这里为插入数据库代码
        System.out.println(record);
        System.out.println("message: " + record);
    }
}
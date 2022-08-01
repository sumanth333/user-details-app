package com.example.userdetailsapp.consumer;

import com.example.userdetailsapp.model.ProductStyle;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "STC_Sample_Topic", groupId = "tempGroupId")
    public void consume(String message) {
        System.out.println("Text  --> "+ message);
    }

    @KafkaListener(topics = "STC_Sample_Topic", groupId = "tempGroupId", containerFactory = "productStyleKafkaListenerFactory")
    public void consumeJson(ProductStyle message) {
        System.out.println("Json ---> "+message);
    }
}

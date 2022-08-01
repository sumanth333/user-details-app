package com.example.userdetailsapp.producer;

import com.example.userdetailsapp.model.ProductStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class StyleProducer {
    private static final String TOPIC = "STC_Sample_Topic";

    @Autowired
    KafkaTemplate<String, ProductStyle> kafkaTemplate;

    public void produce(ProductStyle productStyle) {
        kafkaTemplate.send(TOPIC, productStyle);
    }
}

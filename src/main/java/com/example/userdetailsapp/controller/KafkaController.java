package com.example.userdetailsapp.controller;

import com.example.userdetailsapp.model.ProductStyle;
import com.example.userdetailsapp.producer.StyleProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    StyleProducer styleProducer;

    @PostMapping("/publish")
    public String postMessage(@RequestBody ProductStyle productStyle) {
        styleProducer.produce(productStyle);

        return "Published Successfully";
    }
}

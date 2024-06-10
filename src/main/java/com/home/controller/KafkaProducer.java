package com.home.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String TOPIC_NAME= "topic_demo";

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
        public void sendMessage(String message) {
            kafkaTemplate.send(TOPIC_NAME, message);
        }
    }

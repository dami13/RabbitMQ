package com.example.rabbitmq.service;

import com.example.rabbitmq.model.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificationService {

    private final AmqpTemplate amqpTemplate;
    public void send(NotificationRequest notificationRequest) {
        amqpTemplate.convertAndSend(notificationRequest.exchange(), notificationRequest.routingKey(), notificationRequest.payload());
    }
}

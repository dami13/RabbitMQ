package com.example.rabbitmq.model;

public record NotificationRequest(Object payload, String exchange, String routingKey) {}

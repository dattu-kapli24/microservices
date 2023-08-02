package com.motoassembly.solution.Listner;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void processMessage(String message) {
        System.out.println("Received message: " + message);
        // Process the message as needed
    }
}

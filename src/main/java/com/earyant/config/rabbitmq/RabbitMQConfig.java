package com.earyant.config.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by earyant on 2017 : 09 : 2017/9/20 0020 : 17:00 : .
 * idc  com.earyant.idc.config.rabbitmq
 */
@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue logQueue() {
        return new Queue("log");
    }
    @Bean
    public Queue fooQueue() {
        return new Queue("foo");
    }
}

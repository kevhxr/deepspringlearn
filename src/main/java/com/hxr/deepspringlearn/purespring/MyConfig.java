package com.hxr.deepspringlearn.purespring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public KafkaConsumer getKafkaConsumer() {
        return new KafkaConsumer();
    }
}

package com.alfredzhong.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AzSpringDemoServiceConfig {
    @Bean
    public AzSpringDemoService azSpringDemoService() {
        return new AzSpringDemoService();
    }
}

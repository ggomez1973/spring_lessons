package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleConfig {
    @Bean
    public SomeService aBeanOfSomeServiceImpl(){
        return new SomeServiceImpl();
    }
}

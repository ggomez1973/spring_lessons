package com.example.dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackageClasses = Company.class)
public class MyConfig {
    @Bean
    public Address getAddress(){
        return new Address("Cuchacucha", "1223");
    }
}

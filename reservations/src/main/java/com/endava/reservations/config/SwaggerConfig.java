package com.endava.reservations.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI reservationsApi(){
        return new OpenAPI().info(new Info().title("Reservations Demo")
        .description("Demo App for Development Internship")
        .contact(new Contact().name("German Gomez").email("german.gomez@endava.com"))
        .version("1.0"));
    }
}

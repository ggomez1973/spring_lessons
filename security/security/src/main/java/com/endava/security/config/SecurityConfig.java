package com.endava.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();  // Postman!!
        http.authorizeHttpRequests()
                .antMatchers("/api/v1.0/users/public/**").permitAll()
                .antMatchers(HttpMethod.GET,"/api/v1.0/users/secured").permitAll()
                .antMatchers(HttpMethod.GET,"/api/v1.0/users/secured/**").permitAll()
                .anyRequest().authenticated()
                .and().httpBasic();
    }
}

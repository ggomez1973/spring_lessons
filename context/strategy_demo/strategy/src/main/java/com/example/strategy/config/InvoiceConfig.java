package com.example.strategy.config;

import com.example.strategy.domain.Invoice;
import com.example.strategy.payments.Debit;
import com.example.strategy.payments.PaymentType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// Java Based Configuration
@Configuration
public class InvoiceConfig {
    @Bean
    @Scope("prototype")
    public Invoice invoice(){
        return new Invoice();
    }

    @Bean
    public PaymentType debitPaymentType(){
        return new Debit();
    }
}

package com.example.strategy;

import com.example.strategy.config.InvoiceConfig;
import com.example.strategy.domain.Invoice;
import com.example.strategy.domain.Item;
import com.example.strategy.payments.Debit;
import com.example.strategy.payments.PaymentType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.math.BigDecimal;

@SpringBootApplication
@ComponentScan({"com.example.strategy.payments, com.example.strategy.domain"})
public class StrategyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(InvoiceConfig.class);
		Invoice invoice = applicationContext.getBean(Invoice.class);
		Item item1 = new Item("Birra copada", new BigDecimal("150.50"));
		Item item2 = new Item("Whiskacho", new BigDecimal("34330.80"));
		invoice.addItem(item1, 14);
		invoice.addItem(item2, 3);
		System.out.println(invoice);
	}
}

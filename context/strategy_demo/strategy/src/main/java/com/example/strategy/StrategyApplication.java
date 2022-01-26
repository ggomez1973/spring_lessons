package com.example.strategy;

import com.example.strategy.domain.Invoice;
import com.example.strategy.domain.Item;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class StrategyApplication {

	public static void main(String[] args) {
		// ApplicationContext applicationContext = new AnnotationConfigApplicationContext(InvoiceConfig.class);
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("invoice-config.xml");
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("old-invoice-config.xml");
		Invoice invoice = applicationContext.getBean(Invoice.class);
		Item item1 = new Item("Birra copada", new BigDecimal("150.50"));
		Item item2 = new Item("Whiskacho", new BigDecimal("34330.80"));
		invoice.addItem(item1, 14);
		invoice.addItem(item2, 3);
		System.out.println(invoice);
	}
}

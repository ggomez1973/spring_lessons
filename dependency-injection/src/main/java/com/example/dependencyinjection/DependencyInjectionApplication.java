package com.example.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication implements CommandLineRunner {
	@Autowired
	Company company;

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
		/*
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Company company = applicationContext.getBean(Company.class);
		System.out.println(company.getAddress().getStreet());
		System.out.println(company.getAddress().getNumber());*/
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(company.getAddress().getStreet());
		System.out.println(company.getAddress().getNumber());
	}
}

package com.example.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SomeServiceImpl implements SomeService, InitializingBean, DisposableBean {
    @Override
    public void doSomething() {
        System.out.println("Doing something");
    }

    @PostConstruct
    public void doPostConstruct() {
        System.out.println("Doing PostConstruct");
    }

    @PreDestroy
    public void doPreDestroy() {
        System.out.println("Doing PreDestroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Doing afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Doing destroy");
    }
}

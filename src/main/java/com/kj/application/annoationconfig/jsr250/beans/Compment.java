package com.kj.application.annoationconfig.jsr250.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Compment {

    public void doSomethin() {
        System.out.println("try to do some thing");
    }

    @PostConstruct
    public void beforeDoSomething() {
       System.out.println("before to do something");
    }

    @PreDestroy
    public void afterCloseDoSomething() {
        System.out.println("after class close todo some thing");
    }

}

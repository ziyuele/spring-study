package com.kj.application.aspect.aspectbasedonannoation.bean;

import org.springframework.stereotype.Component;

import com.kj.application.aspect.aspectbasedonannoation.annonation.TestAnnoation;

@Component
public class Compment {

    @TestAnnoation
    public void doSomething() {
        System.out.println("try to do something");
    }

    // @TestAnnoation
    public void doSomethingWhitoutAnnoation() {
        System.out.println("try to do something doSomethingWhitoutAnnoation");
    }
}

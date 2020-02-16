package com.kj.application.aspect.aspectjbased.beans;

import org.springframework.stereotype.Component;

@Component
public class CompmentBean {

    public void doSomething() {
        System.out.println("try to do some thing");
    }

    public void doSomethingNew() {
        System.out.println("this should not be execute");
    }

    public void doAround() {
        System.out.println("this is a round method");
    }
}

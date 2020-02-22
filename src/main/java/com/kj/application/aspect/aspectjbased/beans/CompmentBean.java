package com.kj.application.aspect.aspectjbased.beans;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

@Component
public class CompmentBean {

    public void doSomething() {
        System.out.println("try to do some thing");
    }

    public void doSomethingNew() {
        System.out.println("this should not be execute");
        doSomething();
    }

    public void doAround() {
        System.out.println("this is a round method");
    }

    public void innerInvoke() {
        System.out.println("try to get a inner function whithout aop");
        this.doSomething();
    }

    public void innerInvokeWithAop() {
        System.out.println("try to invoke whith aop");
        ((CompmentBean)AopContext.currentProxy()).doSomething();
    }

}

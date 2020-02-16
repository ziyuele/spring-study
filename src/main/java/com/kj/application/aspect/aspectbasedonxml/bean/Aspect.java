package com.kj.application.aspect.aspectbasedonxml.bean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Aspect {

    public void beforeMethod() {
        System.out.println("this is a before method");
    }

    public void afterMethod() {
        System.out.println("this is a after method");
    }

    public void afterReturn() {
        System.out.println("this will execute after function return");
    }

    public void afterThrowing() {
        System.out.println("this is execute after throw a Exception");
    }

    public void around(ProceedingJoinPoint joinPoint) {
        System.out.println("this is execute around method");
    }
}

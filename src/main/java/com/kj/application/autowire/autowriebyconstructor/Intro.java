package com.kj.application.autowire.autowriebyconstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kj.application.autowire.autowriebyconstructor.beans.Compment;

public class Intro {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("auwowarebyconstructor.xml");
        Compment compment = (Compment) context.getBean("compament");
        compment.doWork();
    }
}

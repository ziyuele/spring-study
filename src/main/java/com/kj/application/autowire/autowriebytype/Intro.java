package com.kj.application.autowire.autowriebytype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kj.application.autowire.autowriebytype.beans.Compment;

public class Intro {
    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowarebytype.xml");
        Compment compment = (Compment) context.getBean("compment");
        compment.doWork();
    }
}

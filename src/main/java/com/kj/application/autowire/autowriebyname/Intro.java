package com.kj.application.autowire.autowriebyname;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kj.application.autowire.autowriebyname.beans.Compment;

public class Intro {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowarebyname.xml");
        Compment compment = (Compment) context.getBean("compment");
        compment.doWork();
    }
}

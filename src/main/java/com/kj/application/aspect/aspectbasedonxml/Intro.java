package com.kj.application.aspect.aspectbasedonxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kj.application.aspect.aspectbasedonxml.bean.Compment;

public class Intro {
    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspectbasedxml.xml");
        String names[] = context.getBeanDefinitionNames();
        for (String name: names) {
            System.out.println(name);
        }
        Compment compment = context.getBean(Compment.class);
        System.out.println("===============================================================");
        compment.beforeTest();
        System.out.println("===============================================================");
        compment.afterTest();
        System.out.println("===============================================================");
        compment.returnString();
        System.out.println("===============================================================");
        compment.aroundTest();
        System.out.println("===============================================================");
        compment.throwsTest();
        System.out.println("===============================================================");
    }

}

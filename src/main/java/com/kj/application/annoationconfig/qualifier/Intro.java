package com.kj.application.annoationconfig.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kj.application.annoationconfig.qualifier.beans.Compent;

public class Intro {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annoationqualifier.xml");
        Compent compent = (Compent) context.getBean("compment");
        compent.doWork();
        String names[] = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}

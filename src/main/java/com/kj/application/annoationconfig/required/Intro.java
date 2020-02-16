package com.kj.application.annoationconfig.required;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kj.application.annoationconfig.required.beans.Compment;

public class Intro {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annoationrequired.xml");
        Compment compment = (Compment) context.getBean("compments");
        System.out.println(compment);
    }
}

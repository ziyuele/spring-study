package com.kj.application.annoationconfig.jsr250;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.kj.application.annoationconfig.jsr250.beans.Compment;
import com.kj.application.annoationconfig.jsr250.beans.ResourceClass;

@Component
public class Intro {

    @Autowired
    Compment compment;

    @Autowired
    ResourceClass resourceClass;

    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jsr250.xml");
        String names[] = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("----------------------");
        Intro intro = applicationContext.getBean(Intro.class);
        intro.compment.doSomethin();
        intro.resourceClass.doSomething();
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
    }
}

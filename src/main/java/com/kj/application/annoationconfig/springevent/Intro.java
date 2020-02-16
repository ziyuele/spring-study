package com.kj.application.annoationconfig.springevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.kj.application.annoationconfig.springevent.beans.CompmentOnStart;

@ComponentScan(basePackages = "com.kj.application.annoationconfig.springevent")
public class Intro {

    @Autowired
    CompmentOnStart compment;

    public static void main(String args[]) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Intro.class);
        String names[] = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        ((AnnotationConfigApplicationContext) applicationContext).start();
        //Intro intro = applicationContext.getBean(Intro.class);
        //intro.compment.doSomgthing();
        ((AnnotationConfigApplicationContext) applicationContext).stop();
    }
}

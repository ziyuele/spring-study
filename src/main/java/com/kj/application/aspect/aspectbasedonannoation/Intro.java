package com.kj.application.aspect.aspectbasedonannoation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.kj.application.aspect.aspectbasedonannoation.bean.Compment;

@ComponentScan(basePackages = "com.kj.application.aspect.aspectbasedonannoation")
@Component
@EnableAspectJAutoProxy
public class Intro {

    @Resource
    Compment component;

    public static void main(String args[]) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Intro.class);
        String names[] = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        Intro intro = applicationContext.getBean(Intro.class);
        System.out.println("===============================================");
        intro.component.doSomething();
        System.out.println("===============================================");
        intro.component.doSomethingWhitoutAnnoation();
        System.out.println("===============================================");
    }
}

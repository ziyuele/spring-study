package com.kj.application.springjdbc.jdbctrasaction.programmingtransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.kj.application.springjdbc.jdbctrasaction.programmingtransaction.database.StudentTemplate;

@Component
@ComponentScan(basePackages = "com.kj.application.springjdbc.jdbctrasaction.programmingtransaction")
@Configuration
public class Intro {

    @Autowired
    StudentTemplate studentTemplate;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Intro.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        Intro intro = context.getBean(Intro.class);
        intro.studentTemplate.create("kk", 8);
    }
}

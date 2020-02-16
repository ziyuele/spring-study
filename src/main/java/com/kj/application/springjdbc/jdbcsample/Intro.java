package com.kj.application.springjdbc.jdbcsample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kj.application.springjdbc.jdbcsample.database.StudentTemplate;

public class Intro {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        StudentTemplate studentTemplate = (StudentTemplate) context.getBean("studentTemplate");
        studentTemplate.create("kangjian", 10);
        System.out.println("========================================================");
        studentTemplate.getStudent(10);
        System.out.println("========================================================");
        studentTemplate.update(1, 23);
        System.out.println("========================================================");
        studentTemplate.listStuent();
        System.out.println("========================================================");
        studentTemplate.delete(10);
        System.out.println("========================================================");
    }
}

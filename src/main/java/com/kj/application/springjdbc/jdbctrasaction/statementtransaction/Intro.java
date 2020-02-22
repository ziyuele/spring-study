package com.kj.application.springjdbc.jdbctrasaction.statementtransaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kj.application.springjdbc.jdbctrasaction.statementtransaction.database.StudentJDBCTemplate;

public class Intro {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springjdbstrsaction.xml");
        String names[] = context.getBeanDefinitionNames();
        for (String name: names) {
            System.out.println(name);
        }

        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentTemplate");
        studentJDBCTemplate.create("kangjian", 1);

    }
}

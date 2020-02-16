package com.kj.application.annoationconfig.qualifier.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Compent {

    @Autowired
    @Qualifier(value = "student")
    private Student student;

    @Autowired
    @Qualifier("student")
    private Student student1;

    public void doWork() {
        System.out.println(student);
        System.out.println("----------");
        System.out.println(student1);
    }
}

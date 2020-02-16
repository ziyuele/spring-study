package com.kj.application.annoationconfig.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kj.application.annoationconfig.autowired.beans.AutowriedOnAttribute;
import com.kj.application.annoationconfig.autowired.beans.AutowriedOnConstructor;
import com.kj.application.annoationconfig.autowired.beans.AutowriedOnSetter;

public class Intro {

    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annoationautowired.xml");
        // one
        AutowriedOnAttribute autowriedOnAttribute = context.getBean(AutowriedOnAttribute.class);
        autowriedOnAttribute.doWork();
        // two
        AutowriedOnConstructor autowriedOnConstructor = context.getBean(AutowriedOnConstructor.class);
        autowriedOnConstructor.doWork();
        // three
        AutowriedOnSetter autowriedOnSetter = context.getBean(AutowriedOnSetter.class);
        autowriedOnSetter.doWork();
    }
}

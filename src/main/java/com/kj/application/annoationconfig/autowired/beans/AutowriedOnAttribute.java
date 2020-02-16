package com.kj.application.annoationconfig.autowired.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowriedOnAttribute {

    @Autowired
    DependencyBeans dependencyBeans;

    public void doWork() {
        System.out.println(this.getClass().getSimpleName());
        dependencyBeans.attributeMethod();
        System.out.println("------------------------------");
    }
}

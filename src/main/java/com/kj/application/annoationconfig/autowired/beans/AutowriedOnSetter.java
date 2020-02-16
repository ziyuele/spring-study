package com.kj.application.annoationconfig.autowired.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowriedOnSetter {
    private DependencyBeans dependencyBeans;

    public DependencyBeans getDependencyBeans() {
        return dependencyBeans;
    }

    @Autowired
    public void setDependencyBeans(DependencyBeans dependencyBeans) {
        this.dependencyBeans = dependencyBeans;
    }

    public void doWork() {
        System.out.println(this.getClass().getSimpleName());
        dependencyBeans.setterMethod();
        System.out.println("-----------------------------");
    }
}


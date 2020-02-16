package com.kj.application.annoationconfig.autowired.beans;

import org.springframework.stereotype.Component;

@Component
public class AutowriedOnConstructor {

    private DependencyBeans dependencyBeans;

    public AutowriedOnConstructor(DependencyBeans dependencyBeans) {
        this.dependencyBeans = dependencyBeans;
    }

    public void doWork() {
        System.out.println(this.getClass().getSimpleName());
        dependencyBeans.constructorMethod();
        System.out.println("--------------------------------");
    }
}

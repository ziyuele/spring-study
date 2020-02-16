package com.kj.application.annoationconfig.autowired.beans;

import org.springframework.stereotype.Component;

@Component
public class DependencyBeans {

    public void attributeMethod() {
        System.out.println("attributeMethod working");
    }

    public void constructorMethod() {
        System.out.println("constructorMethod working");
    }

    public void setterMethod() {
        System.out.println("setterMethod working");
    }
}

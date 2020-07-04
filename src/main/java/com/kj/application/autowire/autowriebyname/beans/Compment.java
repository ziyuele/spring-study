package com.kj.application.autowire.autowriebyname.beans;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Compment {

    private Dependency dependency;
    private String name;

    public void doWork() {
        dependency.doSomething();
        System.out.println("Name is :" + name);
    }
}

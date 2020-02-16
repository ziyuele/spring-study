package com.kj.application.autowire.autowriebytype.beans;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Compment {

    String name;
    Dependency dependency;

    public void doWork() {
        System.out.println(name);
        dependency.doSomething();
    }
}

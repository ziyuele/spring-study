package com.kj.application.annoationconfig.javaconfig.beans;

public class Dependency {

    public void doSomething() {
        System.out.println(this.getClass().getSimpleName() + " try to do something");
    }
}

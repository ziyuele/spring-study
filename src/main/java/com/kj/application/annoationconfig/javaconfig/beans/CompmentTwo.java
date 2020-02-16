package com.kj.application.annoationconfig.javaconfig.beans;

public class CompmentTwo {

    private Dependency dependency;

    public CompmentTwo(Dependency dependency) {
        this.dependency = dependency;
    }

    public void doSomething() {
        System.out.print(this.getClass().getSimpleName() + "is going to get:");
        dependency.doSomething();
    }
}

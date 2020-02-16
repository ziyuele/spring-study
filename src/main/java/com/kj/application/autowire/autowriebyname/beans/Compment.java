package com.kj.application.autowire.autowriebyname.beans;

public class Compment {

    private Dependency dependency;
    private String name;

    public Dependency getDependency() {
        return dependency;
    }

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doWork() {
        dependency.doSomething();
        System.out.println("Name is :" + name);
    }
}

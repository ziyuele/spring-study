package com.kj.application.annoationconfig.jsr250.beans;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class ResourceClass {

    private Dependency dependency;

    public Dependency getDependency() {
        return dependency;
    }

    @Resource
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    public void doSomething() {
        dependency.doSomethin();
    }
}

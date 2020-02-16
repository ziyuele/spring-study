package com.kj.application.di.innerbeandi.beans;

public class CompmentBean {

    private DependencyBean dependencyBean;

    public DependencyBean getDependencyBean() {
        return dependencyBean;
    }

    public void setDependencyBean(DependencyBean dependencyBean) {
        this.dependencyBean = dependencyBean;
    }

    public void doWork() {
        dependencyBean.doSomething();
    }
}

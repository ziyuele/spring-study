package com.kj.application.di.setteredbaseddi.beans;

public class CompmentBean {

    private DependencyBean dependencyBean;

    public DependencyBean getDependencyBean() {
        return dependencyBean;
    }

    public void setDependencyBean(DependencyBean dependencyBean) {
        this.dependencyBean = dependencyBean;
    }

    public void doWork() {
        dependencyBean.doSometing();
    }
}

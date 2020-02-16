package com.kj.application.autowire.autowriebyconstructor.beans;

public class Compment {

    private DenpendencyBean denpendencyBean;
    private String name;

    public Compment(DenpendencyBean denpendencyBean, String name) {
        this.denpendencyBean = denpendencyBean;
        this.name = name;
    }

    public void doWork() {
        System.out.println(name);
        denpendencyBean.doSomethin();
    }
}

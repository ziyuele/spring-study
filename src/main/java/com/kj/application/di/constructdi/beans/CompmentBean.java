package com.kj.application.di.constructdi.beans;


public class CompmentBean {

    private DenpendencyBean denpendencyBean;

    public CompmentBean(DenpendencyBean denpendencyBean) {
        this.denpendencyBean = denpendencyBean;
    }

    public void doWork() {
        denpendencyBean.doSomething();
    }
}

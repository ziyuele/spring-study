package com.kj.application.di.constructdi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kj.application.di.constructdi.beans.CompmentBean;

public class Intro {

    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dicontrusct.xml");
        CompmentBean compmentBean = (CompmentBean) context.getBean("compmentBean");
        compmentBean.doWork();
    }
}

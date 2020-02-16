package com.kj.application.di.setteredbaseddi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kj.application.di.setteredbaseddi.beans.CompmentBean;

public class Intro {

    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("setteredbaseddi.xml");
        CompmentBean compmentBean = (CompmentBean) context.getBean("compment");
        compmentBean.doWork();
    }
}

package com.kj.application.di.innerbeandi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kj.application.di.innerbeandi.beans.CompmentBean;

public class Intro {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("innerbeandi.xml");
        CompmentBean compmentBean = (CompmentBean) context.getBean("compemmt");
        compmentBean.doWork();
    }
}

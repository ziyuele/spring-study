package com.kj.application.annoationconfig.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kj.application.annoationconfig.javaconfig.beans.CompmentOne;
import com.kj.application.annoationconfig.javaconfig.beans.CompmentTwo;
import com.kj.application.annoationconfig.javaconfig.beans.ImportBean;
import com.kj.application.annoationconfig.javaconfig.beans.RegistClass;

public class Intro {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configure.class);
        String names[] = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("=========================通过config 获取bean===============================================");
        CompmentOne compmentOne = applicationContext.getBean(CompmentOne.class);
        compmentOne.doSomething();
        System.out.println("=========================通过代码注入 bean=================================================");
        ((AnnotationConfigApplicationContext) applicationContext).register(RegistClass.class);
        RegistClass registClass = applicationContext.getBean(RegistClass.class);
        registClass.doSomething();
        System.out.println("=========================一个bean 依赖另一个bean===========================================");
        applicationContext.getBean(CompmentTwo.class).doSomething();
        System.out.println("=========================一个configure import 另一个configure=============================");
        applicationContext.getBean(ImportBean.class).doSomething();
        System.out.println("=========================================================================================");
    }
}

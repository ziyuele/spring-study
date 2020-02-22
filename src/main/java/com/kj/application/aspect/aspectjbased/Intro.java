package com.kj.application.aspect.aspectjbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.kj.application.aspect.aspectjbased.beans.CompmentBean;

/**
 *  EnableAspectJAutoProxy 效果等同于： <aop:aspectj-autoproxy/>
 */

@EnableAspectJAutoProxy(exposeProxy = true)
@Configuration
@ComponentScan(basePackages = "com.kj.application.aspect.aspectjbased")
public class Intro {

    @Autowired
    CompmentBean compmentBean;

    public static void main(String args[]) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Intro.class);
        String names[] = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("=========================================");
        Intro intro = applicationContext.getBean(Intro.class);
        intro.compmentBean.doSomething();
        System.out.println("=========================================");
        intro.compmentBean.doSomethingNew();
        System.out.println("=========================================");
        intro.compmentBean.doAround();
        System.out.println("=========================================");
        intro.compmentBean.innerInvoke();
        System.out.println("=========================================");
        intro.compmentBean.innerInvokeWithAop();
    }
}

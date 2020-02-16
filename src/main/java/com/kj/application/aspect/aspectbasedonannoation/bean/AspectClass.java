package com.kj.application.aspect.aspectbasedonannoation.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {

    @Pointcut(value = "@annotation(com.kj.application.aspect.aspectbasedonannoation.annonation.TestAnnoation) "
            + "&& execution(* com.kj.application.aspect.aspectbasedonannoation.bean.Compment.*(..))")
    public void portcut() {}


    @Before("portcut()")
    public void doBefore() {
       System.out.println("this is do before method");
    }
}

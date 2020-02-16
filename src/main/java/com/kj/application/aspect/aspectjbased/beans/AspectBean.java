package com.kj.application.aspect.aspectjbased.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectBean {

    /**
     *  声明了一个切点
     *  一个切入点有助于确定使用不同建议执行的感兴趣的连接点（即方法）。在处理基于配置的 XML 架构时，切入点的声明有两个部分：
     *
     *     一个切入点表达式决定了我们感兴趣的哪个方法会真正被执行。
     *     一个切入点标签包含一个名称和任意数量的参数。方法的真正内容是不相干的，并且实际上它应该是空的。
     */
    @Pointcut(value = "execution(* com.kj.application.aspect.aspectjbased.beans.CompmentBean.doSomething(..))")
    private void aspectDemo() { }

    @Pointcut(value = "execution(* com.kj.application.aspect.aspectjbased.beans.CompmentBean.doSomethingNew(..))")
    private void aspectDemoNew() { }

    @Before("aspectDemo()")
    public void doBefore() {
        System.out.println("this is a before action");
    }

    @After("aspectDemo()")
    public void doAfter() {
        System.out.println("this is a after action");
    }

    @Before("aspectDemoNew()")
    public void doBeforeException() throws Exception {
        // throw new Exception("HHHHHH");
    }

    @Around(value = "execution(* com.kj.application.aspect.aspectjbased.beans.CompmentBean.doAround(..))")
    public Object executionTest(ProceedingJoinPoint joinPoint) {
        System.out.println("aound method");
        try {
            return joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

}

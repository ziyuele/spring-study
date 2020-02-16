package com.kj.application.annoationconfig.userdenfineevent;

import org.springframework.context.ApplicationListener;

import com.kj.application.annoationconfig.userdenfineevent.beans.MyEvent;

/**
 *  自定义的event 作用在业务的bean上
 */
public class UserDenfineEvent implements ApplicationListener<MyEvent>{

    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("user define event");
    }
}

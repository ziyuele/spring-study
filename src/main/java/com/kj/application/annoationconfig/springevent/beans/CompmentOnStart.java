package com.kj.application.annoationconfig.springevent.beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class CompmentOnStart implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println(event.toString() + "contextStartedEvent");
    }

    public void doSomgthing() {
       System.out.println(this.getClass().getSimpleName() + "try to do some thing");
    }
}

package com.kj.application.annoationconfig.springevent.beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Component
public class CompmentOnStop implements ApplicationListener<ContextStoppedEvent> {

    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("context stop resived" + event.getApplicationContext());
    }
}

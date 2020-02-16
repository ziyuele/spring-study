package com.kj.application.annoationconfig.userdenfineevent.beans;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * 通过applicationAware 设置event
 */
@Component
public class EventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void publish() {
       MyEvent myEvent = new MyEvent(this);
       publisher.publishEvent(myEvent);
    }
}

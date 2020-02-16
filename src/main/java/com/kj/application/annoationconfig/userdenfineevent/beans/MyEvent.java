package com.kj.application.annoationconfig.userdenfineevent.beans;

import org.springframework.context.ApplicationEvent;

/**
 *  自定义applicationEvent
 */
public class MyEvent extends ApplicationEvent {

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
    }
}

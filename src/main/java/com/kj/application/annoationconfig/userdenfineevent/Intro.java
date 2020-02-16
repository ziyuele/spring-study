package com.kj.application.annoationconfig.userdenfineevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kj.application.annoationconfig.userdenfineevent.beans.EventPublisher;

@ComponentScan
@Configuration
public class Intro {

    @Bean
    UserDenfineEvent userDenfineEvent() {
        return new UserDenfineEvent();
    }

    @Autowired
    UserDenfineEvent userDenfineEvent;

    public static void main(String args[]) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Intro.class);
        String names[] = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.print(name + ", ");
        }
        System.out.println();
        EventPublisher eventPublisher = applicationContext.getBean(EventPublisher.class);
        eventPublisher.publish();
    }
}

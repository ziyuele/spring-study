package com.kj.application.annoationconfig.jsr250.beans;

import org.springframework.stereotype.Component;

@Component
public class Dependency {
    public void doSomethin() {
        System.out.println("resource try  to do someting");
    }
}

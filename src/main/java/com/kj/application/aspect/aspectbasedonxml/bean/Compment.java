package com.kj.application.aspect.aspectbasedonxml.bean;

public class Compment {
    public void beforeTest() {
        System.out.println("Aspect Compment tried to do beforeTest");
    }

    public void afterTest() {
        System.out.println("Aspect Compment tried to do afterTest");
    }

    public String returnString() {
        System.out.println("Aspect Compment tried to do returnString");
        return "";
    }

    public void throwsTest() {
        System.out.println("Aspect Compment tried to do throwsTest");
        throw new RuntimeException("this is a exception");
    }

    public void aroundTest() {
        System.out.println("Aspect Compment tried to do aroundTest");
    }

}

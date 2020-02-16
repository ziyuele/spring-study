package com.kj.application.di.collectiondi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kj.application.di.collectiondi.beans.CollectionList;

public class Intro {

    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("collectiondi.xml");
        CollectionList collectionList = (CollectionList) context.getBean("collection");
        System.out.println(collectionList);
    }
}

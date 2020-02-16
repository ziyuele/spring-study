package com.kj.application.annoationconfig.required.beans;

import org.springframework.beans.factory.annotation.Required;

public class Compment {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Compment{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }
}

package com.kj.application.springjdbc.jdbcsample.database;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class StudentDTO {

    private String name;

    private Integer age;

    private Integer id;
}

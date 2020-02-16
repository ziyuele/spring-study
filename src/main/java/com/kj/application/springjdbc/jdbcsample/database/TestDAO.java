package com.kj.application.springjdbc.jdbcsample.database;

import java.util.List;

public interface TestDAO {

    void create(String name, Integer age);

    StudentDTO getStudent(Integer id);

    List<StudentDTO>  listStuent();

    void delete(Integer id);

    void update(Integer integer, Integer age);
}

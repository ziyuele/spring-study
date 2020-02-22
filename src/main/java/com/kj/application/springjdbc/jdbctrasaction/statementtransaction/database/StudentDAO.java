package com.kj.application.springjdbc.jdbctrasaction.statementtransaction.database;

import java.util.List;

public interface StudentDAO {

    void create(String name, Integer age);

    StudentDTO getStudent(Integer id);

    List<StudentDTO> listStuent();

    void delete(Integer id);

    void update(Integer integer, Integer age);
}

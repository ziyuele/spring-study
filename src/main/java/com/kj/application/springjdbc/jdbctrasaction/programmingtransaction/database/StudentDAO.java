package com.kj.application.springjdbc.jdbctrasaction.programmingtransaction.database;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kj.application.springjdbc.jdbcsample.database.StudentDTO;

@Repository
public interface StudentDAO {

    void create(String name, Integer age);

    com.kj.application.springjdbc.jdbcsample.database.StudentDTO getStudent(Integer id);

    List<StudentDTO> listStuent();

    void delete(Integer id);

    void update(Integer integer, Integer age);
}

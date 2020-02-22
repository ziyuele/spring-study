package com.kj.application.springjdbc.jdbctrasaction.statementtransaction.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class MyStudentMapper implements RowMapper<StudentDTO> {

    @Override
    public StudentDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setAge(resultSet.getInt("age"));
        studentDTO.setName(resultSet.getString("name"));
        studentDTO.setId(resultSet.getInt("id"));
        return studentDTO;
    }
}

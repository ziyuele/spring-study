package com.kj.application.springjdbc.jdbcsample.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<StudentDTO> {

    @Override
    public StudentDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(resultSet.getInt("id"));
        studentDTO.setAge(resultSet.getInt("age"));
        studentDTO.setName(resultSet.getString("name"));
        return studentDTO;
    }
}

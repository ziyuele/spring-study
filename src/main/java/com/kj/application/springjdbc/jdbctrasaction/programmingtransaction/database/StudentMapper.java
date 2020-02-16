package com.kj.application.springjdbc.jdbctrasaction.programmingtransaction.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kj.application.springjdbc.jdbcsample.database.StudentDTO;

public class StudentMapper implements RowMapper<StudentDTO> {
    @Override
    public StudentDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        com.kj.application.springjdbc.jdbcsample.database.StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(resultSet.getInt("id"));
        studentDTO.setAge(resultSet.getInt("age"));
        studentDTO.setName(resultSet.getString("name"));
        return studentDTO;
    }
}

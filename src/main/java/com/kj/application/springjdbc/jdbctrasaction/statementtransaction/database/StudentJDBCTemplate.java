package com.kj.application.springjdbc.jdbctrasaction.statementtransaction.database;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {

    private JdbcTemplate jdbcTemplate;

    public StudentJDBCTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, Integer age) {
        try {
            String sql = "insert into student (name, age) values (?, ?)";
            jdbcTemplate.update(sql, name, age);
            System.out.println("insert value to table");
            throw new Exception("Just make an exception");
        } catch (Exception e) {
           e.printStackTrace();
        }

    }

    @Override
    public StudentDTO getStudent(Integer id) {
        return null;
    }

    @Override
    public List<StudentDTO> listStuent() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Integer integer, Integer age) {

    }
}

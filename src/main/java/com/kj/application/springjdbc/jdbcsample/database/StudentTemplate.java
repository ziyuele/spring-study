package com.kj.application.springjdbc.jdbcsample.database;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentTemplate implements TestDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public StudentTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update("create table if not exists student ("
                + "id int not null  auto_increment primary key,"
                + "name varchar(20) not null,"
                + "age int not null"
                + ")ENGINE=InnoDB;");
    }

    @Override
    public void create(String name, Integer age) {
        String sql = "insert into student (name, age) values (?, ?)";
        jdbcTemplate.update(sql, name, age);
        System.out.println("Successfully insert value to table");
    }

    @Override
    public StudentDTO getStudent(Integer age) {
        String sql = "select * from student where age = ? limit 1";
        StudentDTO studentDTO = jdbcTemplate.queryForObject(sql, new Object[]{age}, new StudentMapper());
        System.out.println(studentDTO.toString());
        return studentDTO;
    }

    @Override
    public List<StudentDTO> listStuent() {
        String sql = "select * from student";
        List<StudentDTO> studentDTOS = jdbcTemplate.query(sql, new StudentMapper());
        System.out.println(studentDTOS.toString());
        return studentDTOS;
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from student where id = ?";
        jdbcTemplate.update(sql, id);
        System.out.println("delete from table");
    }

    @Override
    public void update(Integer id, Integer age) {
        String sql = "update student set age = ? where id = ?";
        jdbcTemplate.update(sql, age, id);
        System.out.println("update table done");
    }
}

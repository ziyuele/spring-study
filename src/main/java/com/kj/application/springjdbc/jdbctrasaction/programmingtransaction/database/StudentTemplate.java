package com.kj.application.springjdbc.jdbctrasaction.programmingtransaction.database;

import java.util.List;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.kj.application.springjdbc.jdbcsample.database.StudentDTO;

@Repository
public class StudentTemplate implements StudentDAO {

    private JdbcTemplate jdbcTemplate;
    private PlatformTransactionManager transactionManager;

    public StudentTemplate(MyDataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.transactionManager = new DataSourceTransactionManager(dataSource);
        jdbcTemplate.update("create table if not exists student ("
                + "id int not null  auto_increment primary key,"
                + "name varchar(20) not null ,"
                + "age int not null"
                + ")ENGINE=InnoDB;");
    }

    @Override
    public void create(String name, Integer age) {
        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
        try {
            String sql = "insert into student (name, age) values (?, ?)";
            jdbcTemplate.update(sql, name, age);
            System.out.println("insert value to table");
            if (1 > 0) {
                throw  new Exception("Just make an exception");
            }
            transactionManager.commit(transactionStatus);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            transactionManager.rollback(transactionStatus);
            System.out.println("role back done");
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

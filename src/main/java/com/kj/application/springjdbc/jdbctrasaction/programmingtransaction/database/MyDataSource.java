package com.kj.application.springjdbc.jdbctrasaction.programmingtransaction.database;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class MyDataSource extends DriverManagerDataSource {

    public MyDataSource() {
        super("jdbc:mysql://140.143.132.21:8806/spring_test", "doc_wr", "doc_wr");
        this.setDriverClassName("com.mysql.cj.jdbc.Driver");
    }

}

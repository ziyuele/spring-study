package com.kj.application.annoationconfig.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kj.application.annoationconfig.javaconfig.beans.ImportBean;

@Configuration
public class ConfigureTwo {

    @Bean
    public ImportBean importBean() {
        return new ImportBean();
    }

}

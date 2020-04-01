package com.fomkin.testspringapp.config;

import com.fomkin.testspringapp.dao.MySqlDao;
import com.fomkin.testspringapp.dao.UserDao;
import com.fomkin.testspringapp.service.MyUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages =
        {"com.fomkin.testspringapp.dao",
        "com.fomkin.testspringapp.service"})
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/vebinar?UseSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("testtest");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setSchema("vebinar");
        return dataSource;
    }

//    @Bean
//    public UserDao gerUserDao() {
//        return new MySqlDao();
//    }
//
//    @Bean
//    public MyUserService getService() {
//        return new MyUserService();
//    }


}

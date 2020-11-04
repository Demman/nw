package com.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


import java.util.Date;
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication()
//@ComponentScan(basePackages = {"com.web.config"})
//@MapperScan(basePackages = {"com.web.dao"})
public class Demo2Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }
    @Override
    public void run(String... args) {
        System.out.println("-------------------服务启动完成!--------------------"+ new Date());
    }

}

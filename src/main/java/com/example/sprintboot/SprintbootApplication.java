package com.example.sprintboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot.dao")
public class SprintbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprintbootApplication.class, args);
    }

}

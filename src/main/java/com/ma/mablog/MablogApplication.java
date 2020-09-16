package com.ma.mablog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ma.mablog.mapper")
public class MablogApplication {

    public static void main(String[] args) {
        SpringApplication.run(MablogApplication.class, args);
    }

}

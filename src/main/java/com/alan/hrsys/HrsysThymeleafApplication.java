package com.alan.hrsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.alan.hrsys.dao")
@SpringBootApplication
public class HrsysThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrsysThymeleafApplication.class, args);
    }

}

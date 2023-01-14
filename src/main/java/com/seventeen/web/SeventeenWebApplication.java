package com.seventeen.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ryz
 * @date 2023/1/1417:31
 */
@SpringBootApplication
@MapperScan("com.seventeen.web.**.dao")
public class SeventeenWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeventeenWebApplication.class, args);
    }

}

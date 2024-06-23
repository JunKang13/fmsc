package com.kj.fmsc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kj.fmsc.dao")
public class FmscApplication {

    public static void main(String[] args) {
        SpringApplication.run(FmscApplication.class, args);
    }

}

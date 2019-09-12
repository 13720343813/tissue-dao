package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TissueDaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TissueDaoApplication.class, args);
    }

}

package com.otus.hometask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.otus.hometask")
public class HometaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(HometaskApplication.class, args);
    }

}

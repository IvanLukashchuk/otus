package com.otus.hometask.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${spring.datasource.url}")
    public String dbUrl;

    @GetMapping("health")
    public String health(){
        return "{\"status\": \"OK\"}";
    }

    @GetMapping("db")
    public String dbUrl(){
        return dbUrl;
    }
}

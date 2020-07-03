package com.example.custom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(CustomApplication.class, args);
        new Custom().link();
    }

}

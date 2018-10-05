package com.quizapp.quizapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableAutoConfiguration
@SpringBootApplication
@CrossOrigin
public class QuizapiApplication   {

    

    public static void main(String[] args) {
        SpringApplication.run(QuizapiApplication.class, args);
    }
}

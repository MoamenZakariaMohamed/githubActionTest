package com.project.survey;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Slf4j
@Component

//@EnableScheduling
public class SurveyApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SurveyApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(SurveyApplication.class, args);
        System.out.println("hiiii");


    }
}
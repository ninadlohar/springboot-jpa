package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@EntityScan("com.example.model")
@EnableJpaRepositories("com.example.repository")
@ComponentScan({"com.example.controller"})
public class SpringBootBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBackendApplication.class, args);
    }
}
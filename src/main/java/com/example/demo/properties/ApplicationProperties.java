package com.example.demo.properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import java.util.logging.Logger;

public class ApplicationProperties implements CommandLineRunner {
    private final Logger log = Logger.getLogger(ApplicationProperties.class.getName());
    private final String DB_URL = System.getenv("JAVA_BLOG_DB_URL");
    public static void main(String[] args) {
        SpringApplication.run(ApplicationProperties.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

    }
}

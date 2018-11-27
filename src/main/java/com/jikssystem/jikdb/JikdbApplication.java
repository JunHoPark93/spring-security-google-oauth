package com.jikssystem.jikdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class JikdbApplication {

    private static final String PROPERTIES = "spring.config.location=classpath:/oauth.yml";

    public static void main(String[] args) {

        new SpringApplicationBuilder(JikdbApplication.class)
                .properties(PROPERTIES)
                .run(args);
    }
}

package com.github.ud.anton.jokeschucknorris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokesChuckNorrisApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokesChuckNorrisApplication.class, args);
    }
}

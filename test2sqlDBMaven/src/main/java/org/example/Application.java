package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Statement;

@SpringBootApplication
public class Application {
    public static void main(String[] args)  {
        System.out.println("Hello inside application");

        SpringApplication.run(Application.class, args);


    }
}
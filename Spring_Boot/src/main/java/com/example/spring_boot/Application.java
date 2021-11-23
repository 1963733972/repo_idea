package com.example.spring_boot;

import com.example.spring_boot.Bean.Pet;
import com.example.spring_boot.Bean.User;
import com.example.spring_boot.config.Sconfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        AnnotationConfigApplicationContext a= new AnnotationConfigApplicationContext(Sconfig.class);
        ConfigurableEnvironment environment = a.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
        System.out.println(run.containsBean("pet1"));
        System.out.println(run.containsBean("user01"));
    }

}

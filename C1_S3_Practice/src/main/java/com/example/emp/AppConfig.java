package com.example.emp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Configuration
public class AppConfig {

    @Bean
    public Department department() {
        return new Department(101, "Human Resources");
    }

    @Bean
    public Employee employee() throws ParseException {
        // Set up a sample DOB for demonstration purposes
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return new Employee(1, "John Doe", dateFormat.parse("1990-05-15"), department());
    }
}


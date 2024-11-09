package com.example.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee employee = context.getBean(Employee.class);

        System.out.println("Employee Details:");
        System.out.println(employee);
    }
}

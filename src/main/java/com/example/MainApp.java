package com.example;

import com.example.config.configApp;
import com.example.container.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.example")
public class MainApp
{
    static void main(String[] args)
    {
        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainApp.class);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(configApp.class);
        UserController userController = applicationContext.getBean(UserController.class);

        userController.addUser("Mohit");
        userController.listAllUser();


    }

}

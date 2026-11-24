package com.example.container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.services.UserService;

import java.util.List;

@Controller
public class UserController
{
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser(String name)
    {
        userService.addUser(name);
        System.out.println("User is added : " + name);
    }

    public void listAllUser()
    {
        List<String> users = userService.listAll();
        System.out.println("All users : " + users);
    }
}

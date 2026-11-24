package com.example.db;


import java.util.ArrayList;
import java.util.List;


public class DatabaseConnection
{
    private List<String> users;

    public void init()
    {
        System.out.println("Initializing the database");
        users = new ArrayList<>();
        System.out.println("Database is initialized");
    }

    public List<String> getUsers()
    {
        return users;
    }

    public void setUser(String name)
    {
        users.add(name);
    }

    public void cleanup()
    {
        System.out.println("Database is disconnected");
    }
}

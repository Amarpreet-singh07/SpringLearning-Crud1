package com.example.repository;


import com.example.db.DatabaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository
{
    private DatabaseConnection db;

    @Autowired
    public UserRepository(DatabaseConnection db) {
        this.db = db;
    }

    public List<String> findAllUsers()
    {
        return db.getUsers();
    }

    public void saveUser(String name)
    {
        db.setUser(name);
    }
}

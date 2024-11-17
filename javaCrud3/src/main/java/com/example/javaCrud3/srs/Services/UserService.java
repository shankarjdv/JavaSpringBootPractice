package com.example.javaCrud3.srs.Services;

import com.example.javaCrud3.srs.Entity.User;
import com.example.javaCrud3.srs.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo repo;
    public User createUser(User userPayload){
        return repo.save(userPayload);
    }

    public List<User> getAllUser(){
        return repo.findAll();
    }

}

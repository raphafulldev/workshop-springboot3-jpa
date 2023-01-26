package com.raphafulldev.course.services;

import com.raphafulldev.course.entities.User;
import com.raphafulldev.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById (Long id){
        return repository.findById(id).get();
    }

    public User insert (User obj){
        return repository.save(obj);
    }


}

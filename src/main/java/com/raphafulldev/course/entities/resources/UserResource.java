package com.raphafulldev.course.entities.resources;

import com.raphafulldev.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll (){
        User u = new User(1L,"Maria", "maria@gmail.com", "85 994350578", "12313");
        return ResponseEntity.ok().body(u);
    }

}

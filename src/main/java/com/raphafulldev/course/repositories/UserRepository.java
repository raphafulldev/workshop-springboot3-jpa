package com.raphafulldev.course.repositories;

import com.raphafulldev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}

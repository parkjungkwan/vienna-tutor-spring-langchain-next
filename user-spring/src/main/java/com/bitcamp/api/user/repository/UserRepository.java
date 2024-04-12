package com.bitcamp.api.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.bitcamp.api.user.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findByUsername(String username);
    List<User> findUsersByName(String name);
    List<User> findUsersByJob(String job);


    
    
} 
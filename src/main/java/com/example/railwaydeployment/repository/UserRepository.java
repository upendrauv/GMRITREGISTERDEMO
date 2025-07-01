package com.example.railwaydeployment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.railwaydeployment.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}

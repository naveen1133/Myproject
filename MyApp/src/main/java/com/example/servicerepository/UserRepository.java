package com.example.servicerepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dto.User;

public interface UserRepository extends JpaRepository<User , String> {

}

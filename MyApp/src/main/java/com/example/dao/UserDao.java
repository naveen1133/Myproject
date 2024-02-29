package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.User;
import com.example.service.UserService;
import com.example.servicerepository.UserRepository;

@Service
public class UserDao implements UserService{
	
	@Autowired
	private UserRepository repo; 

	@Override
	public User addUser(User user) {
		
		return repo.save(user);
	}

	@Override
	public List<User> allUsers() {
		
		return repo.findAll();
	}

}

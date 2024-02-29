package com.example.service;

import java.util.List;

import com.example.dto.User;

public interface UserService {
	
	public User addUser(User user);
	
	public List<User> allUsers();
}

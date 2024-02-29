package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDao;
import com.example.dto.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserDao dao;
	
	@PostMapping(path="/addUser")
	public User createUser(@RequestBody User user)
	{
		return dao.addUser(user);
	}
	
	@GetMapping(path="/allUsers")
	public List<User> findAllUsers()
	
	{
		return dao.allUsers();
	}

}

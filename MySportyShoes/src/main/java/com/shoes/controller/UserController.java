package com.shoes.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoes.model.User;
import com.shoes.service.UserService;

	@RestController
	public class UserController {

		@Autowired
		private UserService service;

		@PostMapping("/user")
		public User addUser(@RequestBody User user) {
			return service.addUser(user);
		}

	   @GetMapping("/user/{userId}")
		public User getUserById(@PathVariable int userId) {
			return service.getUserById(userId);
		}

		@PutMapping("/user")
		public User updateUser(@RequestBody User user) {
			return service.updateUser(user);
		}

		@DeleteMapping("/user/{userId}")
		public void deleteUserById(@PathVariable int userId) {
			service.deleteUserById(userId);	
		}

		@GetMapping("/users")
		public List<User> getAllUsers() {
			return service.getAllUsers();
		}

		@GetMapping("/user/userName/{userName}")
		public List<User> getUserByName(@PathVariable String userName) {	
			return service.getUserByName(userName) ;
		}


	    @GetMapping("/user/userAge/{userAge}")
		public List<User> getUserByAge(@PathVariable int userAge) {
			return service.getUserByAge(userAge);
	    }

	    @GetMapping("/user/date/{date}")
		public List<User> getUserByDate(@PathVariable Date date) {
			return service.getUserByDate(date);
		}
	}
	

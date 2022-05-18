package com.shoes.service.impl;

import java.util.Date;
//import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shoes.dao.UserRepository;
import com.shoes.model.User;
import com.shoes.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository dao;
	
	@Override
	public User addUser(User user) {	
		return dao.save(user);
	}

	@Override
	public User getUserById(int userId) {
		return dao.findById(userId).get();
	}

	@Override
	public User updateUser(User user) {
		return dao.save(user);
	}

	@Override
	public void deleteUserById(int userId) {
		 dao.deleteById(userId);
	}

	@Override
	public List<User> getAllUsers() {
		return dao.findAll();
	}

	@Override
	public List<User> getUserByName(String userName) {
		return dao.findByuserName(userName);
	}
	@Override
	public List<User> getUserByAge(int userAge) {	
		return dao.findByUserAge(userAge);
	}

	@Override
	public List<User> getUserByDate(Date date) {
		
		return dao.findByDate(date);
	}

}
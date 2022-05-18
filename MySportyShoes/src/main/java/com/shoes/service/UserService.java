package com.shoes.service;

import java.util.Date;
import java.util.List;
import com.shoes.model.User;

public interface UserService {
	
	public User addUser(User user);
	public User getUserById(int userId);
	public User updateUser(User user);
	public void deleteUserById(int userId);
	public List<User> getAllUsers();
	public List<User> getUserByName(String userName);
	public List<User> getUserByAge(int userAge);
	public List<User> getUserByDate(Date date);
	

}

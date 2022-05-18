package com.shoes.dao;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import com.shoes.model.Address;
import com.shoes.model.Shoes;
import com.shoes.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
		public List<User> findByUserAge(int userAge);
		public List<User> findByuserName(String userName);
		public List<User> findByDate(Date date);		
	}
	
	


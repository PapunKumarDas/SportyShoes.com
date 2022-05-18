package com.shoes.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int userId;
	private String userName;
	private int userAge;
	private Date date;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinTable(name = "user_shoes",
			joinColumns = @JoinColumn(name="user_shoes"),
			inverseJoinColumns = @JoinColumn(name="shoesId"))
	private List<Shoes> shoes;

}

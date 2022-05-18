package com.shoes.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Cart {
	@Id
	private int cartId;
	private String cartName;
	private int qty;  //Quantity
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	@JoinTable(name = "cart_shoes",
	joinColumns = @JoinColumn(name="cartId"),
	inverseJoinColumns = @JoinColumn(name="shoesId"))
	private List<Shoes> shoes;

}

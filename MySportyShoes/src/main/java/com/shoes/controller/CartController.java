package com.shoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoes.model.Cart;
import com.shoes.service.CartService;

@RestController
public class CartController {

	@Autowired
	private CartService service;
	
	@PostMapping("/cart")
	public Cart addToCart(@RequestBody Cart cart) {
		return service.addToCart(cart);
	}

	@DeleteMapping("/cart/{cartId}")
	public void deleteCart(@PathVariable int cartId) {
		service.deleteCart(cartId);
	}

	@PutMapping("/cart")
	public Cart updateCart(@RequestBody Cart cart) {
		return service.updateCart(cart);
	}

	@GetMapping("/cart/{cartId}")
	public Cart getCartById(@PathVariable int cartId) {
		return service.getCartById(cartId);
	}

	@GetMapping("/getAllCarts")
	public List<Cart> getAllCarts() {
		return service.getAllCarts();
	}

}

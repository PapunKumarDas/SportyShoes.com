package com.shoes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shoes.dao.CartRepository;
import com.shoes.model.Cart;
import com.shoes.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository dao;
	
	@Override
	public Cart addToCart(Cart cart) {
		return dao.save(cart);
	}

	@Override
	public void deleteCart(int cartId) {
		dao.deleteById(cartId);	
	}

	@Override
	public Cart updateCart(Cart cart) {
		return dao.save(cart);
	}

	@Override
	public Cart getCartById(int cartId) {
		return dao.findById(cartId).get();
	}

	@Override
	public List<Cart> getAllCarts() {
		return dao.findAll();
	}

}

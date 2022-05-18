package com.shoes.service;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.shoes.model.Cart;


public interface CartService  
{
	public Cart addToCart(Cart cart);
	public void deleteCart(int cartId);
	public Cart updateCart(Cart cart);
	public Cart getCartById(int cartId);
	public List<Cart> getAllCarts();
}

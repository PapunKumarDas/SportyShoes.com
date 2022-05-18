package com.shoes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shoes.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}

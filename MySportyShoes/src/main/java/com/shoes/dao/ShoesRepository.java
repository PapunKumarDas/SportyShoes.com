package com.shoes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shoes.model.Shoes;

@Repository
public interface ShoesRepository extends JpaRepository<Shoes, Integer> {
	public List<Shoes> findByBrand(String brand);
	public List<Shoes> findByColor(String color);
	public List<Shoes> findBySize(int size);
	public List<Shoes> findByPrice(int price);
}

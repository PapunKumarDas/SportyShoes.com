package com.shoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoes.dao.ShoesRepository;
import com.shoes.model.Shoes;
import com.shoes.service.ShoesService;

@Service
public class ShoesServiceImpl implements ShoesService{
	
	@Autowired
	private ShoesRepository dao;

	@Override
	public Shoes addShoes(Shoes shoes) {
		return dao.save(shoes);
	}

	@Override
	public Shoes updateShoes(Shoes shoes) {
		return dao.save(shoes);
	}

	@Override
	public Shoes getShoesById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public void deleteShoesById(int id) {
		dao.deleteById(id);
	}

	@Override
	public List<Shoes> getAllShoes() {	
		return dao.findAll();
	}

	@Override
	public List<Shoes> getShoesByBrand(String brand) {
		return dao.findByBrand(brand);
	}

	@Override
	public List<Shoes> getShoesByColor(String color) {
	return dao.findByColor(color);
	}

	@Override
	public List<Shoes> getShoesBySize(int size) {
	return dao.findBySize(size);
	}

	@Override
	public List<Shoes> getShoesByPrice(int price) {
		return dao.findByPrice(price);
	}
}

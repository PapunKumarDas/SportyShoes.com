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

import com.shoes.model.Shoes;
import com.shoes.service.ShoesService;

@RestController
public class ShoesController {

	@Autowired
	private ShoesService service;
	
	@PostMapping("/shoes")
	public Shoes addShoes(@RequestBody Shoes shoes) {
		return service.addShoes(shoes);
	}

	@PutMapping("/shoes")
	public Shoes updateShoes(@RequestBody Shoes shoes) {
		
		return service.updateShoes(shoes);
	}

	@GetMapping("/shoes/{id}")
	public Shoes getShoesById(@PathVariable int id) {
		
		return service.getShoesById(id);
	}
	
	@DeleteMapping("/shoes/{id}")
	public void deleteShoesById(@PathVariable int id) {
	 service.deleteShoesById(id);
		
	}
	@GetMapping("/shoes")
	public List<Shoes> getAllShoes() {
		return service.getAllShoes();
	}
	@GetMapping("/shoes/brand/{brand}")
	public List<Shoes> getShoesByBrand(@PathVariable String brand) {
		
		return service.getShoesByBrand(brand);
	}

	@GetMapping("/shoes/color/{color}")
	public List<Shoes> getShoesByColor(@PathVariable String color) {
	
		return service.getShoesByColor(color);
	}

	@GetMapping("/shoes/size/{size}")
	public List<Shoes> getShoesBySize(@PathVariable int size) {
		
		return service.getShoesBySize(size);
	}

	@GetMapping("/shoes/price/{price}")
	public List<Shoes> getShoesByPrice(@PathVariable int price) {
		
		return service.getShoesByPrice(price);
	}
}

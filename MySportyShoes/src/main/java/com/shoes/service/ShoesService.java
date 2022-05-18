package com.shoes.service;

import java.util.List;
import com.shoes.model.Shoes;

public interface ShoesService {
	
	public Shoes addShoes(Shoes shoes);
	public Shoes updateShoes(Shoes shoes);
	public Shoes getShoesById(int id);
	public void deleteShoesById(int id);
	public List<Shoes> getAllShoes();
	public List<Shoes> getShoesByBrand(String brand);
	public List<Shoes> getShoesByColor(String color);
	public List<Shoes> getShoesBySize(int size);
	public List<Shoes> getShoesByPrice(int price);

}

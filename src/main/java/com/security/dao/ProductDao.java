package com.security.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.security.entity.ProductEntity;
import com.security.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository productRepo;
	 
	public String post(ProductEntity product) {
		productRepo.save(product);
		return "Saved successfully";
	}
	public Optional<ProductEntity> getById(Integer id) {
		return productRepo.findById(id);
	}
	public Optional<ProductEntity> getByName(String name){
		return Optional.ofNullable(productRepo.getByName(name));
	}
	
}

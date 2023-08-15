package com.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.security.dao.ProductDao;
import com.security.entity.ProductEntity;
import com.security.exception.ProductNotFoundException;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	ProductDao productDao;
	 
	public String post(ProductEntity poduct) {
		return productDao.post(poduct);
	}
	public ProductEntity getbyId(Integer id) throws ProductNotFoundException {
		 Optional<ProductEntity> o=productDao.getById(id);
		 if(o.isPresent())
			 return o.get();
		 else
			 throw new ProductNotFoundException("invalid id");
	}
	public ProductEntity getByName(String name) throws ProductNotFoundException {
		Optional<ProductEntity> o=productDao.getByName(name);
		if(o.isPresent())
			return o.get();
		else
			throw new ProductNotFoundException("product not found");
	}
}

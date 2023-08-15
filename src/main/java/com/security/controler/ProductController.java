package com.security.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.security.entity.ProductEntity;
import com.security.exception.ProductNotFoundException;
import com.security.service.Service;

import jakarta.websocket.server.PathParam;

@RestController
public class ProductController {
	@Autowired
	Service service;
	@PostMapping("/postAll")
	public String postAll(@RequestBody ProductEntity product) {
		return service.post(product);
	}
	
	@GetMapping("getbyId")
	public ProductEntity get(@PathParam(value = "id") Integer idm) throws ProductNotFoundException {
		return service.getbyId(idm);
	} 
	@GetMapping("getByName")
	public ProductEntity getByName(@RequestParam("namee") String name) throws ProductNotFoundException {
		return service.getByName(name);
	}
}

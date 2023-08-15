package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.security.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

	@Query(value="SELECT * FROM Product_all WHERE name like ?", nativeQuery=true)
	public ProductEntity getByName(String name) ;
}

package com.lobato.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lobato.curso.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	

}

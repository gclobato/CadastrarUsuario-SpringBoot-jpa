package com.lobato.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lobato.curso.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}

package com.lobato.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.lobato.curso.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	

}

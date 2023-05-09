package com.lobato.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lobato.curso.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}

package com.lobato.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lobato.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}

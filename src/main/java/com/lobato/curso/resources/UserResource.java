package com.lobato.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lobato.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findALL(){
		User u = new User(1L, "Maria", "maria@gmail.com", "(61)9.9999-9999", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}
package com.zavala.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zavala.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);  //Spring Data JPA já implementa !
	
}

package edu.auok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.auok.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}

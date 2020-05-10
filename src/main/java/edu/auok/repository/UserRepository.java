package edu.auok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.auok.model.User;

import java.util.List;

/**
 * @author HaoTian
 */
public interface UserRepository extends JpaRepository<User, Integer>{

    User findByAccount(String account);
}

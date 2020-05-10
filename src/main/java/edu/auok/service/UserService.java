package edu.auok.service;

import edu.auok.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    List<User> findAllNotDoctor();

    User findByAccount(String account);
}

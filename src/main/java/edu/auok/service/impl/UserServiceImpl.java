package edu.auok.service.impl;

import edu.auok.model.User;
import edu.auok.repository.UserRepository;
import edu.auok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HaoTian
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll(){
        return repository.findAll();
    }

    @Override
    public List<User> findAllNotDoctor() {
        return null;
    }

    @Override
    public User findByAccount(String account){
        return repository.findByAccount(account);
    }
}

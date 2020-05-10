package edu.auok.service.impl;

import edu.auok.model.UserRole;
import edu.auok.repository.UserRoleRepository;
import edu.auok.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HaoTian
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository repository;

    @Override
    public List<UserRole> listByUserId(Integer userId) {
        return repository.findByUserId(userId);
    }
}

package edu.auok.service.impl;

import edu.auok.model.Role;
import edu.auok.repository.RoleRepository;
import edu.auok.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role selectById(int id) {
        return roleRepository.findById(id);
    }
}

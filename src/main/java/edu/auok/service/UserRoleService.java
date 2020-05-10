package edu.auok.service;

import edu.auok.model.UserRole;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author HaoTian
 */
@Component
public interface UserRoleService {

    List<UserRole> listByUserId(Integer userId);
}

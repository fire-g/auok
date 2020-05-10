package edu.auok.repository;

import edu.auok.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author HaoTian
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findById(int id);
}

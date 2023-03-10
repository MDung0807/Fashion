package com.web.fashion.fashion.models.repositories;

import com.web.fashion.fashion.models.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDAO extends JpaRepository<Role, Integer> {
    Role getByRole(String roleName);
}

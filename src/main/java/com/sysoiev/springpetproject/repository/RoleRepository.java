package com.sysoiev.springpetproject.repository;

import com.sysoiev.springpetproject.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

package com.sysoiev.springpetproject.repository;

import com.sysoiev.springpetproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}

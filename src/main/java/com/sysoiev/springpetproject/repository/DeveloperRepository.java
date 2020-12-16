package com.sysoiev.springpetproject.repository;

import com.sysoiev.springpetproject.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
}

package com.sysoiev.springpetproject.repository;

import com.sysoiev.springpetproject.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
    Skill findByName(String name);
}

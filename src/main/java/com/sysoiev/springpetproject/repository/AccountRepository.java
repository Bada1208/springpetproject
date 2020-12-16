package com.sysoiev.springpetproject.repository;

import com.sysoiev.springpetproject.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}

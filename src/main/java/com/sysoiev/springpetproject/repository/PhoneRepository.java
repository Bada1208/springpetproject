package com.sysoiev.springpetproject.repository;

import com.sysoiev.springpetproject.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

    Phone findByPhoneNumber(String number);
}

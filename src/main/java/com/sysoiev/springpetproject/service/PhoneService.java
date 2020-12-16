package com.sysoiev.springpetproject.service;


import com.sysoiev.springpetproject.model.Phone;

public interface PhoneService {

    Phone register(Phone phone);

    String getVerificationCode();

    Phone findPhoneNumber(String number);

    void sendCodeSms(Phone phone);
}
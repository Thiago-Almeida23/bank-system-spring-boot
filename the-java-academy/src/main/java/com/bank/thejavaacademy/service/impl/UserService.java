package com.bank.thejavaacademy.service.impl;

import com.bank.thejavaacademy.dto.BankResponse;
import com.bank.thejavaacademy.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);

}

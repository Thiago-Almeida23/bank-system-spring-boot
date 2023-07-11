package com.bank.thejavaacademy.service.impl;

import com.bank.thejavaacademy.dto.BankResponse;
import com.bank.thejavaacademy.dto.UserRequest;
import com.bank.thejavaacademy.entity.User;

public class UserServiceImpl implements UserService {

    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        /**
         * Creating an account - saving a new user into db.
         */
        var newUser = User.builder()

                .build();
    }
    }
}

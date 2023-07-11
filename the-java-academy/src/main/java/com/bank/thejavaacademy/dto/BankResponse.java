package com.bank.thejavaacademy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankResponse {

    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;
}

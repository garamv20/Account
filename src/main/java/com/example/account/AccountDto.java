package com.example.account;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class AccountDto {
    private String accountNumber;
    private String nickName;
    private LocalDateTime registeredAt;
}

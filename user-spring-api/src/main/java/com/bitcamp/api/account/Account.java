package com.bitcamp.api.account;


import lombok.*;

import java.util.Date;
import java.util.List;

import com.bitcamp.api.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class Account {
    private Long id;
    private String accountNumber;
    private String accountHolder;
    private Double balance;

    @Column(name = "transaction_date")
    private Date transactionDate;

    @OneToMany(mappedBy = "account") 
    private List<User> user;

    @Builder(builderMethodName = "builder")
    public Account(long id, String accountNumber, String accountHolder, double balance, Date transactionDate) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionDate = transactionDate;
    }
}

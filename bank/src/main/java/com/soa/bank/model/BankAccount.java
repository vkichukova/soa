package com.soa.bank.model;

import javax.persistence.*;

@Entity
@Table(name = "bank_account")
public class BankAccount {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long accountId;

    private Double currentBalance;

    public BankAccount(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Long getAccountId() {
        return accountId;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }
}

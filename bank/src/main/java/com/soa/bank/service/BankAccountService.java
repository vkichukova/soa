package com.soa.bank.service;

import com.soa.bank.model.BankAccount;
import com.soa.bank.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BankAccountService {

    private final BankAccountRepository accountRepository;

    public BankAccountService(@Autowired BankAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public BankAccount findByAccountNumber(Long accountId){
        BankAccount account = accountRepository.findByAccountIdEquals(accountId);
        return account;
    }

}

package com.soa.bank.controller;

import com.soa.bank.model.BankAccount;
import com.soa.bank.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TransactionController {

    @Autowired
    private BankAccountService accountService;

    @PostMapping("/buyProduct")
    public void buyProduct(@RequestParam(value = "amount") Double amount, @RequestParam(value = "accountId") Long accountId) {
        BankAccount account = accountService.findByAccountNumber(accountId);
        account.setCurrentBalance(account.getCurrentBalance() - amount);
    }

}

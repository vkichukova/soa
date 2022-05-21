package com.soa.bank.controller;

import com.soa.bank.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankAccountController {

    @Autowired
    private BankAccountService accountService;

    @GetMapping("/getAccount")
    public void getAccountById(@RequestParam(value = "id") Long accountId) {
        accountService.findByAccountNumber(accountId);
    }

}

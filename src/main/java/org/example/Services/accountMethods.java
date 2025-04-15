package org.example.Services;

import org.example.Model.account;
import org.example.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class accountMethods {

    private final AccountRepository accountRepository;

    @Autowired
    public accountMethods(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<account> getAllAccounts() {
        return accountRepository.findAll();
    }
}

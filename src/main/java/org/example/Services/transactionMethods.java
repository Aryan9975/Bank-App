package org.example.Services;


import org.example.Model.transaction;

import org.example.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class transactionMethods {

    private final TransactionRepository transactionRepository;

    @Autowired
    public transactionMethods(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
}

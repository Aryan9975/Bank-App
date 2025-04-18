package org.example.Controller;

import org.example.Model.transaction;
import org.example.Services.transactionMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@PreAuthorize("hasRole('ADMIN')")
public class TransactionController {

    @Autowired
    private transactionMethods transactionMethods;

    @GetMapping
    public ResponseEntity<List<transaction>> getAllTransactions() {
        List<transaction> transactions = transactionMethods.getAllTransactions();
        return ResponseEntity.ok(transactions);
    }
}

package org.example.Controller;

import org.example.Model.transaction;
import org.example.Model.transactionrequest;
import org.example.Services.transactionMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/performtransactions")
@PreAuthorize("hasRole('ADMIN')")
public class PerformTransactionController {

    @Autowired
    private transactionMethods transactionMethods;

    @PostMapping
    public ResponseEntity<String> processTransaction(@RequestBody transactionrequest request) {
        try {
            transactionMethods.processTransaction(
                    request.getFrom(),
                    request.getTo(),
                    request.getAmount(),
                    request.getType(),
                    request.getDescription()
            );
            return ResponseEntity.ok("Transaction processed successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Transaction failed: " + e.getMessage());
        }
    }
}

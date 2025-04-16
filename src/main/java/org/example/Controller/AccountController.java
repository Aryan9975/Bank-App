package org.example.Controller;

import org.example.Model.account;
import org.example.Services.accountMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private accountMethods accountMethods;

    @GetMapping
    public ResponseEntity<List<account>> getAllAccounts() {
        List<account> accounts = accountMethods.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }
}

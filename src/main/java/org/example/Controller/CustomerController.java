package org.example.Controller;

import org.example.Model.customer;
import org.example.Services.customerMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private customerMethods customerMethods;

    @GetMapping
    public ResponseEntity<List<customer>> getAllCustomers() {
        List<customer> customers = customerMethods.getAllCustomers();
        return ResponseEntity.ok(customers);
    }
}


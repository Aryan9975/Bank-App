package org.example.Services;

import org.example.Model.customer;
import org.example.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class customerMethods {

    private final CustomerRepository customerRepository;

    @Autowired
    public customerMethods(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Call this later from a controller or elsewhere
    public List<customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}

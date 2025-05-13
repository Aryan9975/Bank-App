package org.example.Services;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.Model.transaction;

import org.example.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
public class transactionMethods {

    private final TransactionRepository transactionRepository;

    @Autowired
    public transactionMethods(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
    @PersistenceContext
    private EntityManager entityManager;

    public List<transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
    @Transactional
    public void processTransaction(UUID from, UUID to, BigDecimal amount, String type, String description) {
        entityManager.createNativeQuery("SELECT process_transaction(:p_from, :p_to, :p_amount, :p_type, :p_description)")
                .setParameter("p_from", from)
                .setParameter("p_to", to)
                .setParameter("p_amount", amount)
                .setParameter("p_type", type)
                .setParameter("p_description", description)
                .getSingleResult(); 
    }

}

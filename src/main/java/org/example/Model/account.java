package org.example.Model;
import lombok.Data;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "accounts")
@Data
public class account {
    @Id
    @Column(name = "account_id")
    private UUID accountid;

    @Column(name = "customer_id") // snake_case column
    private UUID customerid;

    @Column(name = "account_type")
    private String accounttype;

    @Column(name = "balance")
    private int balance;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at")
    private Timestamp createdAt;
}


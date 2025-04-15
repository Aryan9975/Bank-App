package org.example.Model;
import lombok.Data;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "customers")
@Data
public class customer {
    @Id
    @Column(name = "customer_id")
    private UUID customerId;

    @Column(name = "first_name") // snake_case column
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "created_at")
    private Timestamp createdAt;
}


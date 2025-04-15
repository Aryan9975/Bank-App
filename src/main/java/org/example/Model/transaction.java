package org.example.Model;
import lombok.Data;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "transactions")
@Data
public class transaction {
    @Id
    @Column(name = "transaction_id")
    private UUID transactionid;

    @Column(name = "from_account") // snake_case column
    private UUID fromaccountid;

    @Column(name = "to_account") // snake_case column
    private UUID toaccountid;

    @Column(name = "amount")
    private int amount;

    @Column(name = "transaction_type")
    private String tt;

    @Column(name = "description")
    private String desc;

    @Column(name = "created_at")
    private Timestamp createdAt;
}


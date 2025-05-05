package org.example.Model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class transactionrequest {

    private UUID from;
    private UUID to;
    private BigDecimal amount;
    private String type;
    private String description;
}

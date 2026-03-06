package SistemaBancario.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private Integer ID;
    private String TransactionType;
    private BigDecimal amount;
    private Integer sourceAccountId;
    private Integer targetAccountId;
    private LocalDateTime timestamp;
    private String description;



}

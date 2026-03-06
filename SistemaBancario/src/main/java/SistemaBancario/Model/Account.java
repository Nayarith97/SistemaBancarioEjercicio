package SistemaBancario.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Account {
    private Integer ID;
    private String AccountType;
    private String status;
    private BigDecimal balance;
    private String customerId;
    private LocalDateTime createdAt;

    public Account(Integer ID, String accountType, String status, BigDecimal balance, String customerId, LocalDateTime createdAt) {
        this.ID = ID;
        AccountType = accountType;
        this.status = status;
        this.balance = balance;
        this.customerId = customerId;
        this.createdAt = createdAt;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

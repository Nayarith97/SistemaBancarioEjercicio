package SistemaBancario.dto;

import SistemaBancario.AccountType;
import SistemaBancario.eAccountStatus;

import java.math.BigDecimal;
import java.util.UUID;

public class AccountDto {
    private UUID ID;
    private AccountType accountType ;
    private eAccountStatus status;
    private BigDecimal balance;
    private String customerId;

    public AccountDto(UUID ID, AccountType accountType, eAccountStatus status, BigDecimal balance, String customerId) {
        this.ID = ID;
        this.accountType = accountType;
        this.status = status;
        this.balance = balance;
        this.customerId = customerId;
    }

    public AccountDto() {
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public eAccountStatus getStatus() {
        return status;
    }

    public void setStatus(eAccountStatus status) {
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
}

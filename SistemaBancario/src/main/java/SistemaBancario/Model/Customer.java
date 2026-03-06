package SistemaBancario.Model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Customer {
    private String documentNumber ;
    private String fullName;
    private String email;
    private LocalDateTime createdAt;

    public Customer(String documentNumber, String fullName, String email, LocalDateTime createdAt) {
        this.documentNumber = documentNumber;
        this.fullName = fullName;
        this.email = email;
        this.createdAt = createdAt;
    }

    public Customer() {
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

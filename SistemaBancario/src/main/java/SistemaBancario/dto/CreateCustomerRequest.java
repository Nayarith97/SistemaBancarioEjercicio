package SistemaBancario.dto;

import java.time.LocalDateTime;

public record CreateCustomerRequest(
        String documentNumber,
        String fullName,
        String email,
        LocalDateTime createdAt
) {
}

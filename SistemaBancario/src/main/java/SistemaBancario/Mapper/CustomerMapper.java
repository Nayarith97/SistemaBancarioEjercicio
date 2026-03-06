package SistemaBancario.Mapper;

import SistemaBancario.Model.Customer;
import SistemaBancario.dto.CustomerDto;

public class CustomerMapper {

    //convertir la tabla a dto
    public static CustomerDto toDTO(Customer customer)
    {
        return new CustomerDto(
                customer.getDocumentNumber(),
                customer.getFullName(),
                customer.getEmail()
        );
    }

    //Convertir dto a tabla
    public static Customer toTable(CustomerDto dto)
    {
        Customer customer= new Customer();
        customer.setFullName(dto.getFullName());
        customer.setDocumentNumber(dto.getDocumentNumber());
        customer.setEmail(dto.getEmail());
        return customer;

    }
}

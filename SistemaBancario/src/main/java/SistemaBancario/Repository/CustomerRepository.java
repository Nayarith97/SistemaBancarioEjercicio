package SistemaBancario.Repository;

import SistemaBancario.Model.Customer;
import SistemaBancario.dto.CustomerDto;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.*;

@Repository
public class CustomerRepository {
    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer("1049659439", "Gerardo López", "gerardol@gmail.com", LocalDateTime.now()),
            new Customer("1504040404", "Alejandra García", "alegarcia@gmail.com", LocalDateTime.now()),
            new Customer("1030902022", "Laura Sanchéz", "lauras@gmail.com", LocalDateTime.now()),
            new Customer("1021000101", "Carlos Martínez", "carlosm@gmail.com", LocalDateTime.now())
    ));


    public List<Customer> getCustomerList() {
        return customers;
    }


    public Optional<Customer> getCustomerByDocument(String document) {
        return  customers.stream().filter(
                user->user.getDocumentNumber().equals(document)).findFirst();

    }
}



package SistemaBancario.Service;

import SistemaBancario.Model.Customer;
import SistemaBancario.Repository.CustomerRepository;
import SistemaBancario.dto.CreateCustomerRequest;
import SistemaBancario.dto.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class CustomerServiceImpl implements ICustomerService{

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer("1050654210", "Gerardo López", "gerardol@gmail.com", LocalDateTime.now()),
            new Customer("1049654819", "Alejandra García", "alegarcia@gmail.com", LocalDateTime.now()),
            new Customer("1030567231", "Laura Sanchéz", "lauras@gmail.com", LocalDateTime.now()),
            new Customer("1020564871", "Carlos Martínez", "carlosm@gmail.com", LocalDateTime.now())
    ));




    @Override
    public List<Customer> getCustomerList() {
        return customers;
    }

    @Override
    public CustomerDto getCustomerByDocument(String document) {
        for (Customer c: customers ){
            if (c.getDocumentNumber().equalsIgnoreCase(document) ){
                return new CustomerDto.
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado: "+ name);
    }
}

package SistemaBancario.Service;

import SistemaBancario.Model.Account;
import SistemaBancario.Model.Customer;
import SistemaBancario.Repository.CustomerRepository;
import SistemaBancario.dto.AccountDto;
import SistemaBancario.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;


@Service
public class CustomerServiceImpl implements ICustomerService{

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }


    @Override
    public List<CustomerDto> getCustomerList() {

        return customerRepository.getCustomerList().stream().map(
                customer ->new CustomerDto(customer.getDocumentNumber(),
                        customer.getFullName(), customer.getEmail())).toList();
    }

    @Override
 public CustomerDto getCustomerByDocument(String document) {
        Customer customer= customerRepository.
                getCustomerByDocument(document)
                .orElseThrow();
    return new CustomerDto(
            customer.getDocumentNumber(),
            customer.getFullName(),
            customer.getEmail());
  }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {

        Customer customer1 = new Customer(
                customerDto.getDocumentNumber(),
                customerDto.getFullName(),
                customerDto.getEmail(),
                LocalDateTime.now()
        );
        Customer savedCustomer= customerRepository.postCustomer(customer1);
        return new CustomerDto(
                savedCustomer.getDocumentNumber(),
                savedCustomer.getFullName(),
                savedCustomer.getEmail());
    }
}

package SistemaBancario.Service;


import SistemaBancario.Model.Customer;
import SistemaBancario.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ICustomerService {
    List<CustomerDto> getCustomerList();
    CustomerDto getCustomerByDocument(String documentNumber);
}


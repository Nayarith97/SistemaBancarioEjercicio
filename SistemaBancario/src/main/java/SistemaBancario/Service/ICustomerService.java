package SistemaBancario.Service;


import SistemaBancario.dto.CreateCustomerRequest;
import SistemaBancario.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICustomerService {
    List<CustomerDto> getCustomerList();
    CustomerDto getCustomerByDocument(String documentNumber);
}


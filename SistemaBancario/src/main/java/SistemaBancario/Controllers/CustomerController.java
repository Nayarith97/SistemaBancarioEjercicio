package SistemaBancario.Controllers;

import SistemaBancario.Service.ICustomerService;
import SistemaBancario.dto.CustomerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    // Inyeccion de dependencias
    private final ICustomerService iCustomerService;

    public CustomerController(ICustomerService iCustomerService) {
        this.iCustomerService = iCustomerService;
    }

    @GetMapping
    public List<CustomerDto> getCustomerList() {
        return iCustomerService.getCustomerList() ;
    }

    @GetMapping("/{documentNumber}")
    //ResponseEntity<?>permite dar respuestas personalizadas, no un solo tipo de dato
    // (tipo customer/cliente o una cadena de texto cuando no encuentra el cliente)
    public CustomerDto getCustomerByDocument(@PathVariable String documentNumber) {
       return iCustomerService.getCustomerByDocument(documentNumber);
    }
}

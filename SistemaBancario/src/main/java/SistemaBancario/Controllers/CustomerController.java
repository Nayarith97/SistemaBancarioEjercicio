package SistemaBancario.Controllers;

import SistemaBancario.Model.Customer;
import SistemaBancario.Service.ICustomerService;
import SistemaBancario.dto.CreateCustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    // Inyeccion de dependencias
    private final ICustomerService iCustomerService;

    public CustomerController(ICustomerService iCustomerService) {
        this.iCustomerService = iCustomerService;
    }

    @GetMapping
    public List<Customer> getCustomerList() {
        return iCustomerService.getCustomerList();
    }

    @GetMapping("/{documentNumber}")
    //ResponseEntity<?>permite dar respuestas personalizadas, no un solo tipo de dato
    // (tipo customer/cliente o una cadena de texto cuando no encuentra el cliente)
    public CreateCustomerRequest getCustomerByDocument(@PathVariable String documentNumber) {
       return iCustomerService.getCustomerByDocument(documentNumber);
    }
}

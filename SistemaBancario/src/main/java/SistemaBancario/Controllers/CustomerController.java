package SistemaBancario.Controllers;

import SistemaBancario.Service.ICustomerService;
import SistemaBancario.dto.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    // Inyeccion de dependencias
    private final ICustomerService iCustomerService;

    public CustomerController(ICustomerService iCustomerService)
    {
        this.iCustomerService = iCustomerService;
    }

    @GetMapping
    public ResponseEntity<List<CustomerDto>> getCustomerList() {

        return ResponseEntity.ok(this.iCustomerService.getCustomerList());
    }


    @GetMapping("/{documentNumber}")
    public ResponseEntity<CustomerDto>  getCustomerByDocument(@PathVariable String documentNumber) {
        CustomerDto customerDto=iCustomerService.getCustomerByDocument(documentNumber);

        if (customerDto == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(customerDto);
    }

    @PostMapping
    public ResponseEntity<CustomerDto> saveCustomer(@RequestBody CustomerDto customerDto)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.iCustomerService.saveCustomer(customerDto)) ;
    }
}

package SistemaBancario.Controllers;


import SistemaBancario.Exception.ResourceNotFoundException;
import SistemaBancario.Service.IAccountService;
import SistemaBancario.dto.AccountDto;
import SistemaBancario.dto.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/api/accounts")

public class AccountController {

    // Inyeccion de dependencias
    private final IAccountService iAccountService;

    public AccountController(IAccountService iAccountService) {
        this.iAccountService = iAccountService;
    }

    @GetMapping
    public ResponseEntity<List<AccountDto>>  getAccountList()
    {
        return ResponseEntity.ok(this.iAccountService.getAccountList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountDto>  getAccountById(@PathVariable UUID id) {
        AccountDto accountDto=iAccountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    }


    @PostMapping
    public ResponseEntity<AccountDto> saveAccount(@RequestBody AccountDto accountDto)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.iAccountService.createAccount(accountDto)) ;
    }
}

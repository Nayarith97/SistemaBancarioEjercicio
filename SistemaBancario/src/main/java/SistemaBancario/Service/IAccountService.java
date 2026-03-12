package SistemaBancario.Service;
import SistemaBancario.Model.Account;
import SistemaBancario.dto.AccountDto;

import java.util.List;
import java.util.UUID;

public interface IAccountService {
    List<AccountDto> getAccountList();
    AccountDto getAccountById(UUID Id);
    AccountDto createAccount(AccountDto accountDto);
}

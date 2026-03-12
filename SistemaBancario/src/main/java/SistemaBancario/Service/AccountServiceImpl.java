package SistemaBancario.Service;


import SistemaBancario.Exception.ResourceNotFoundException;
import SistemaBancario.Model.Account;
import SistemaBancario.Repository.AccountRepository;
import SistemaBancario.dto.AccountDto;
import SistemaBancario.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class AccountServiceImpl implements IAccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<AccountDto> getAccountList() {
        return accountRepository.getAccountList().stream().map(
                account ->new AccountDto(
                        account.getID(),
                        account.getAccountType(),
                        account.getStatus(),
                        account.getBalance(),
                        account.getCustomerId()
                )).toList();
    }

    @Override
    public AccountDto getAccountById(UUID Id) {
        Account account=accountRepository.getAccountById(Id).
                orElseThrow(()->new ResourceNotFoundException("accounts", "id", Id.toString()));

        return new AccountDto(
                account.getID(),
                account.getAccountType(),
                account.getStatus(),
                account.getBalance(),
                account.getCustomerId()
        );
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {

        Account account1 = new Account(
                UUID.randomUUID(),
                accountDto.getAccountType(),
                accountDto.getStatus(),
                accountDto.getBalance(),
                accountDto.getCustomerId(),
                LocalDateTime.now()
        );
        Account savedAccount= accountRepository.createAccount(account1);
        return new AccountDto(
                savedAccount.getID(),
                savedAccount.getAccountType(),
                savedAccount.getStatus(),
                savedAccount.getBalance(),
                savedAccount.getCustomerId());
    }

}

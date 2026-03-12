package SistemaBancario.Repository;

import SistemaBancario.Model.Account;
import SistemaBancario.Model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class AccountRepository {

    private List<Account> accounts= new ArrayList<>();

    public Account createAccount(Account account) {
        accounts.add(account);
        return account;
    }

    public List<Account> getAccountList() {
        return accounts;
    }

    public Optional<Account> getAccountById(UUID id){
        return accounts.stream().filter(
                account -> account.getID().equals(id)).findFirst();

    }

}

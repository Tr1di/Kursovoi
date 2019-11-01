package ru.mmo.database.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public AccountRepository getAccountRepository() {
        return accountRepository;
    }

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void addUser(Account account) {
        accountRepository.saveAndFlush(account);
    }

    @Override
    public void editUser(Account account) {
        addUser(account);
    }

    @Override
    public void deleteUser(String login) {
        accountRepository.delete(login);
    }

    @Override
    public Account getByLogin(String login) {
        return accountRepository.findOne(login);
    }

    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public boolean checkPassword(String login, String password) {
        return accountRepository.getOne(login).checkPassword(password);
    }
}

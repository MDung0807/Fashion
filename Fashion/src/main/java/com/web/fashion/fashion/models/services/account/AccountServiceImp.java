package com.web.fashion.fashion.models.services.account;

import com.web.fashion.fashion.DTO.AccountDTO;
import com.web.fashion.fashion.models.entities.Account;
import com.web.fashion.fashion.models.repositories.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImp implements AccountService{

    @Autowired
    private AccountDAO accountDAO;
    @Override
    @Transactional
    public void createAccount(AccountDTO accountDTO) {
        Account account = Account.builder()
                .username(accountDTO.getUsername())
                .password(accountDTO.getPassword()).build();
        accountDAO.save(account);
    }

    @Override
    @Transactional
    public void deleteAcc(int id) {
        accountDAO.deleteById(id);
    }

    @Override
    public AccountDTO updateAcc(AccountDTO accountDTO, int id) {
        return null;
    }

    @Override
    @Transactional
    public AccountDTO getAcc(int id) {
        Account account = accountDAO.getReferenceById(id);
        AccountDTO accountDTO = AccountDTO.builder()
                .username(account.getUsername())
                .password(account.getPassword())
                .user(account.getUser()).build();
        return accountDTO;
    }
}

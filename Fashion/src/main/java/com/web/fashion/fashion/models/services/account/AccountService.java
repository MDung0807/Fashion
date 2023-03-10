package com.web.fashion.fashion.models.services.account;

import com.web.fashion.fashion.DTO.AccountDTO;

public interface AccountService {
    void createAccount(AccountDTO accountDTO);

    void deleteAcc(int id);

    AccountDTO updateAcc(AccountDTO accountDTO, int id);

    AccountDTO getAcc(int id);
}

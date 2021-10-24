package com.pengkk27.pwstorage.services;

import com.pengkk27.pwstorage.entity.Account;

public interface AccountService {

    void addAccount(Account account, String userId, String category);

    void updateAccount(Account account, String categoryId);

    void deleteAccountById(String accountId);

    void deleteAllAccount(String userId);
}

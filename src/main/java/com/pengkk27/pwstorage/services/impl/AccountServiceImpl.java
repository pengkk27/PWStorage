package com.pengkk27.pwstorage.services.impl;

import com.pengkk27.pwstorage.dao.AccountMapper;
import com.pengkk27.pwstorage.entity.Account;
import com.pengkk27.pwstorage.services.AccountService;
import com.pengkk27.pwstorage.tools.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void addAccount(Account account, String userId, String category) {
        account.setAccountId(Tools.getUUID());
        accountMapper.addAccount(account, userId, category);
    }

    @Override
    public void updateAccount(Account account, String categoryId) {
        accountMapper.updateAccount(account, categoryId);
    }

    @Override
    public void deleteAccountById(String accountId) {
        accountMapper.deleteAccountById(accountId);
    }

    @Override
    public void deleteAllAccount(String userId) {
        accountMapper.deleteAllAccounts(userId);
    }
}

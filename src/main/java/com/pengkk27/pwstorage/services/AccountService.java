package com.pengkk27.pwstorage.services;

import com.pengkk27.pwstorage.dao.AccountMapper;
import com.pengkk27.pwstorage.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public List<Account> getAllAccountByClassesId(String classId) {
        HashMap<String, String> map = new HashMap<>();
        map.put("userId", "1");
        map.put("classId", classId);
        List<Account> allAccountByClassesId = accountMapper.getAllAccountByClassesId(map);
        System.out.println(allAccountByClassesId);
        if (allAccountByClassesId.isEmpty()){
            allAccountByClassesId.add(new Account(0, 1, " ", " ", " ", " ", Integer.parseInt(classId)));
        }
        return allAccountByClassesId;
    }

    public int addAccount(Account account) {
        return accountMapper.addAccount(account);
    }

    public int deleteAccount(int accountId) {
        return accountMapper.deleteAccount(accountId);
    }

    public int updateAccount(Account account) {
        System.out.println(account);
        Account accountSource = accountMapper.getAccountById(account.getAccountId());
        if (account.getAccountId() == 0) {
            account.setAccountId(accountSource.getAccountId());
        }
        if (account.getAccountPassword() == "") {
            account.setAccountPassword(accountSource.getAccountPassword());
        }
        if (account.getAccountDescription() == "") {
            account.setAccountDescription(accountSource.getAccountDescription());
        }
        if (account.getAccountClass() == "") {
            account.setAccountClass(accountSource.getAccountClass());
        }
        return accountMapper.updateAccount(account);
    }

    public Account getAccountById(int accountId) {
        return accountMapper.getAccountById(accountId);
    }
}

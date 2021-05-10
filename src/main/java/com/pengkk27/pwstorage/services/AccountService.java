package com.pengkk27.pwstorage.services;

import com.pengkk27.pwstorage.dao.AccountMapper;
import com.pengkk27.pwstorage.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public List<Account> getAllAccountByClassesId(String classId) {
        HashMap<String, String> map = new HashMap<>();
        map.put("userId", "1");
        map.put("classId", classId);
        return accountMapper.getAllAccountByClassesId(map);
    }

    public int addAccount(Account account) {
        return accountMapper.addAccount(account);
    }

    public int deleteAccount(int accountId) {
        return accountMapper.deleteAccount(accountId);
    }

    public Account getAccountById(int accountId) {
        return accountMapper.getAccountById(accountId);
    }
}

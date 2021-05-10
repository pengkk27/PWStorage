package com.pengkk27.pwstorage.dao;

import com.pengkk27.pwstorage.entity.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AccountMapper {

    List<Account> getAllAccountByClassesId(Map map);

    int addAccount(Account account);

    int deleteAccount(int accountId);

    Account getAccountById(int accountId);
}

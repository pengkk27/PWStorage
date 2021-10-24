package com.pengkk27.pwstorage.dao;

import com.pengkk27.pwstorage.entity.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

    void addAccount(Account account, String userId, String categoryId);

    void updateAccount(Account account, String categoryId);

    void deleteAccountById(String accountId);

    void deleteAllAccounts(String userId);

}

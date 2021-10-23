package com.pengkk27.pwstorage.dao;

import com.pengkk27.pwstorage.entity.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void addAccountTest() {
        Account account = new Account("123458", "112233445566", "123456", "游戏账号2", "吃鸡");
        accountMapper.addAccount(account, "123456", "123456");
    }

    @Test
    public void updateAccountTest() {
        Account account = new Account("123458", "456654321", "656655", "游戏账号2", "吃鸡");
        accountMapper.updateAccount(account, null);
    }

    @Test
    public void deleteAccountTest() {
        accountMapper.deleteAccountById("123458");
    }
}

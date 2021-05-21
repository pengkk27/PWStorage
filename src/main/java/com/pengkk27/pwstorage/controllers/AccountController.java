package com.pengkk27.pwstorage.controllers;

import com.pengkk27.pwstorage.entity.Account;
import com.pengkk27.pwstorage.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/toAdd/{classId}")
    public String toAdd(@PathVariable("classId")String classId, Model model) {
        model.addAttribute("classId", classId);
        model.addAttribute("userId", 1);
        return "/admin/addAccount";
    }

    @RequestMapping("/add")
    public String add(Account account) {
        accountService.addAccount(account);
        return "redirect:/classes/toAccounts/" + account.getClassId();
    }

    @RequestMapping("/delete/{accountId}/{classId}")
    public String delete(@PathVariable("accountId") int accountId, @PathVariable("classId") int classId) {
        accountService.deleteAccount(accountId);
        return "redirect:/classes/toAccounts/" + classId;
    }

    @RequestMapping("/toUpdate/{accountId}")
    public String toUpdate(@PathVariable("accountId") int accountId, Model model) {
        Account account = accountService.getAccountById(accountId);
        model.addAttribute("account", account);
        return "/admin/updateAccount";
    }

    @RequestMapping("/update")
    public String update(Account account) {
        accountService.updateAccount(account);
        return "redirect:/account/getAccount/" + account.getAccountId();
    }

    @RequestMapping("/getAccount/{accountId}")
    public String getAccount(@PathVariable("accountId") int accountId, Model model) {
        Account account = accountService.getAccountById(accountId);
        model.addAttribute("account", account);
        return "/admin/account";
    }

}

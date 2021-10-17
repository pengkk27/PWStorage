package com.pengkk27.pwstorage.services.impl;

import com.pengkk27.pwstorage.dao.AdminMapper;
import com.pengkk27.pwstorage.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServerImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean adminLogin(String admin, String password) {
        if (password.equals(adminMapper.getPasswordById(admin)))
            return true;
        return false;
    }
}

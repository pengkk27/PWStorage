package com.pengkk27.pwstorage.services.impl;

import com.pengkk27.pwstorage.dao.AdminMapper;
import com.pengkk27.pwstorage.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean adminLogin(String admin, String password) {
        return password.equals(adminMapper.getPasswordById(admin));
    }
}

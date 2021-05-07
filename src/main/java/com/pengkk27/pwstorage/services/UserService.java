package com.pengkk27.pwstorage.services;

import com.pengkk27.pwstorage.dao.UserMapper;
import com.pengkk27.pwstorage.entity.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserInformation getUserIdPassword(){
        return userMapper.getUserIdPassword();
    }

}

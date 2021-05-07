package com.pengkk27.pwstorage.dao;

import com.pengkk27.pwstorage.entity.UserInformation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

     UserInformation getUserIdPassword();

}

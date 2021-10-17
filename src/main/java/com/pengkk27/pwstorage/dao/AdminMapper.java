package com.pengkk27.pwstorage.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {

    String getPasswordById(String adminId);
}

package com.pengkk27.pwstorage.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface ValidationMapper {

    int addValidation(Map map);
}

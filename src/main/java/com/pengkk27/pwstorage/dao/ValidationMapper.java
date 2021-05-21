package com.pengkk27.pwstorage.dao;

import com.pengkk27.pwstorage.entity.Validation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ValidationMapper {

    int addValidation(Map map);

    List<Integer> getValidationId();

    Validation getValidationById(int id);
}

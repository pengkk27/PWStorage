package com.pengkk27.pwstorage.dao;

import com.pengkk27.pwstorage.entity.Classes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassesMapper {

    int addClass(String className);

    int deleteClass(int classId);

    List<Classes> getClasses();

}

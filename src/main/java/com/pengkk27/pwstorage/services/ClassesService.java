package com.pengkk27.pwstorage.services;

import com.pengkk27.pwstorage.dao.ClassesMapper;
import com.pengkk27.pwstorage.entity.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassesService {

    @Autowired
    private ClassesMapper classesMapper;

    public int addClass(String className){
        return classesMapper.addClass(className);
    }

    public int deleteClass(int classId) {
        return classesMapper.deleteClass(classId);
    }

    public List<Classes> getClasses() {
        return classesMapper.getClasses();
    }

}

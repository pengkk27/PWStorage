package com.pengkk27.pwstorage.services;

import com.pengkk27.pwstorage.dao.ValidationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ValidationService {

    @Autowired
    private ValidationMapper validationMapper;

    public int addValidation(String question, String answer){
        HashMap<String, String> map = new HashMap<>();
        map.put("userId", "1");
        map.put("question", question);
        map.put("answer", answer);
        return validationMapper.addValidation(map);
    }

}

package com.pengkk27.pwstorage.services;

import com.pengkk27.pwstorage.dao.ValidationMapper;
import com.pengkk27.pwstorage.entity.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

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

    public Validation getValidationId() {
        List<Integer> validationId = validationMapper.getValidationId();
        Random random = new Random();
        int id = random.nextInt(validationId.size());
        return validationMapper.getValidationById(id);
    }

    public Validation getValidationById(int id) {
        return validationMapper.getValidationById(id);
    }

}

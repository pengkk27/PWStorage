package com.pengkk27.pwstorage.dao;

import com.pengkk27.pwstorage.entity.Question;
import com.pengkk27.pwstorage.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface UserMapper {

    void registered(User user);

    String getPasswordByUserId(String userId);

    void updatePasswordByUserId(String userId, String userPassword);

    void deleteUserById(String userId);

    void addValidation(Question question, String userId);

    void updateValidationById(String questionId, String question, String answer);

    List<Question> getQuestionByUserId(String userId);

    void deleteValidationById(String questionId);

}

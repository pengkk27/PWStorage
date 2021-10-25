package com.pengkk27.pwstorage.services;

import com.pengkk27.pwstorage.entity.Question;

import java.util.List;

public interface UserService {

    void registered(String userName, String userPassword);

    boolean loginValidate(String userName, String userPassword);

    List<String> getUserIdAndUserNameByUserName(String userName);

    void changePassword(String userId, String userPassword);

    void deleteUser(String userId);

    void addValidation(String question, String answer, String userId);

    void changeValidation(String questionId, String question, String answer);

    List<Question> getAllQuestion(String userId);

    void deleteValidation(String questionId);
}

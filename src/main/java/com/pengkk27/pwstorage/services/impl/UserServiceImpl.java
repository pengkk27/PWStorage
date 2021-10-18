package com.pengkk27.pwstorage.services.impl;

import com.pengkk27.pwstorage.dao.UserMapper;
import com.pengkk27.pwstorage.entity.Question;
import com.pengkk27.pwstorage.entity.User;
import com.pengkk27.pwstorage.services.UserService;
import com.pengkk27.pwstorage.tools.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void registered(String userName, String userPassword) {
        User newUser = new User(Tools.getUUID(), userName, Tools.getMd5String(userPassword));
        userMapper.registered(newUser);
    }

    @Override
    public boolean loginValidate(String userId, String userPassword) {
        return Objects.equals(Tools.getMd5String(userPassword), userMapper.getPasswordByUserId(userId));
    }

    @Override
    public void changePassword(String userId, String userPassword) {
        if (!("".equals(userPassword))) {
            userMapper.updatePasswordByUserId(userId, Tools.getMd5String(userPassword));
        }
    }

    @Override
    public void deleteUser(String userId) {
        userMapper.deleteUserById(userId);
    }

    @Override
    public void addValidation(String question, String answer, String userId) {
        Question validateQuestion = new Question(Tools.getUUID(), question, answer);
        userMapper.addValidation(validateQuestion, userId);
    }

    @Override
    public void changeValidation(String questionId, String question, String answer) {
        userMapper.updateValidationById(questionId, question, answer);
    }

    @Override
    public List<Question> getAllQuestion(String userId) {
        return userMapper.getQuestionByUserId(userId);
    }

    @Override
    public void deleteValidation(String questionId) {
        userMapper.deleteValidationById(questionId);
    }

}

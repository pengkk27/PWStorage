package com.pengkk27.pwstorage.services;

import com.pengkk27.pwstorage.entity.Question;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void registeredTest() {
        userService.registered("pengkk27", "123456");
    }

    @Test
    public void loginTest() {
        System.out.println(userService.loginValidate("8c4a34d22afb4dbcb844d956d85540ec", "123456"));
    }

    @Test
    public void changePasswordTest() {
        userService.changePassword("8c4a34d22afb4dbcb844d956d85540ec", "654321");
        System.out.println(userService.loginValidate("8c4a34d22afb4dbcb844d956d85540ec", "123456"));
        System.out.println(userService.loginValidate("8c4a34d22afb4dbcb844d956d85540ec", "654321"));
    }

    @Test
    public void deleteUserTest() {
        userService.deleteUser("8c4a34d22afb4dbcb844d956d85540ec");
    }


    @Test
    public void addQuestionTest() {
        userService.addValidation("1+1", "2", "8c4a34d22afb4dbcb844d956d85540ec");
    }

    @Test
    public void changeValidationTest() {
        userService.changeValidation("f65c308573ce4c569592dea54bb0c147", "1+2", "3");
        userService.changeValidation("f65c308573ce4c569592dea54bb0c147", "1+2", "");
        userService.changeValidation("f65c308573ce4c569592dea54bb0c147", "1+2", "");
    }

    @Test
    public void getAllQuestionTest() {
        List<Question> list = userService.getAllQuestion("8c4a34d22afb4dbcb844d956d85540ec");
        for (Question question : list) {
            System.out.println(question.getQuestion() + " " + question.getAnswer());
        }
    }

    @Test
    public void deleteValidation() {
        userService.deleteValidation("f65c308573ce4c569592dea54bb0c147");
    }
}

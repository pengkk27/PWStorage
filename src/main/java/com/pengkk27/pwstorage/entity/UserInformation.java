package com.pengkk27.pwstorage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInformation {
    private int userId;
    private String userName;
    private String userPassword;
    private String userEmail;
    private int userValidation;
}

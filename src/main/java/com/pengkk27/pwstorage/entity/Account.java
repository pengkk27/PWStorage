package com.pengkk27.pwstorage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private int accountId;
    private int userId;
    private String accountNumber;
    private String accountPassword;
    private String accountDescription;
    private String accountClass;
    private int classId;

}

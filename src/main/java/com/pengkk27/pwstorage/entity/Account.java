package com.pengkk27.pwstorage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private String accountId;
    private String accountNumber;
    private String accountPassword;
    private String accountDescription;
    private String title;

}

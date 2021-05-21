package com.pengkk27.pwstorage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Validation {
    private int validationId;
    private int userId;
    private String validationQuestion;
    private String validationAnswer;
}

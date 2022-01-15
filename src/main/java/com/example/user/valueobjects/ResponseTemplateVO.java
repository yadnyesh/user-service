package com.example.user.valueobjects;

import com.example.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseTemplateVO {
    private User user;
    private Department department;
}

package com.example.user.valueobjects;

import com.example.user.entity.User;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ResponseTemplateVO {
    private User user;
    private Department department;
}

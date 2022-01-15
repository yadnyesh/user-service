package com.example.user.valueobjects;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {
    private Long departmentId;

    private String departmentName;

    private String departmentAddress;

    private String departmentCode;
}

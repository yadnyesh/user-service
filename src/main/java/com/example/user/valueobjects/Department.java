package com.example.user.valueobjects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {
    private Long departmentId;

    private String departmentName;

    private String departmentAddress;

    private String departmentCode;
}

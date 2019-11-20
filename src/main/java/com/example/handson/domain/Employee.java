package com.example.handson.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private Long id;
    private String name;
    private int roleId;
    private final String contractTypeName;
    private String roleName;
    private String roleDescription;
    private double salary;
    private double annualSalary;
}

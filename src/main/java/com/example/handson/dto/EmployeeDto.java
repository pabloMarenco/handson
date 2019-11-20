package com.example.handson.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Data
public class EmployeeDto implements Serializable {
    private Long id;
    private String name;
    private String contractTypeName;
    private int roleId;
    private String roleName;
    private String roleDescription;
    private double hourlySalary;
    private double monthlySalary;


    public EmployeeDto(){

    }


}

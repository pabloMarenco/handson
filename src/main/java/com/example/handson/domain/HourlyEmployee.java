package com.example.handson.domain;

public class HourlyEmployee extends Employee {

    public HourlyEmployee(Long id, String name, int roleId, String roleName, String roleDescription, double salary, double annualSalary) {
        super(id, name, roleId, "HourlySalaryEmployee", roleName, roleDescription, salary, annualSalary);
    }
}

package com.example.handson.domain;

public class MonthlyEmployee extends Employee {

    public MonthlyEmployee(Long id, String name, int roleId, String roleName, String roleDescription, double salary, double annualSalary) {
        super(id, name, roleId, "MonthlySalaryEmployee", roleName, roleDescription, salary, 0);
    }
}

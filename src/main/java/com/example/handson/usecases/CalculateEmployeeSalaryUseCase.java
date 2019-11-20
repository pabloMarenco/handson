package com.example.handson.usecases;

import com.example.handson.domain.Employee;
import com.example.handson.domain.HourlyEmployee;
import org.springframework.stereotype.Component;

@Component
public class CalculateEmployeeSalaryUseCase implements ICalculateEmployeeAnnualSalaryUseCase {

    @Override
    public Employee calculateSalary(Employee employee) {
        if (employee instanceof HourlyEmployee) {
            final double annualSalary = 120 * employee.getSalary() * 12;
            return new HourlyEmployee(employee.getId(), employee.getName(), employee.getRoleId(),
                    employee.getRoleName(), employee.getRoleDescription(), employee.getSalary(), annualSalary);
        } else {
            final double annualSalary = employee.getSalary() * 12;
            return new HourlyEmployee(employee.getId(), employee.getName(), employee.getRoleId(),
                    employee.getRoleName(), employee.getRoleDescription(), employee.getSalary(), annualSalary);
        }
    }
}

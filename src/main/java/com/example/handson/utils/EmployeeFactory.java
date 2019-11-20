package com.example.handson.utils;

import com.example.handson.domain.Employee;
import com.example.handson.domain.HourlyEmployee;
import com.example.handson.domain.MonthlyEmployee;
import com.example.handson.dto.EmployeeDto;
import com.example.handson.exception.ContractTypeNotValidException;
import org.springframework.stereotype.Component;

@Component
public class EmployeeFactory {

    public Employee newEmployee(EmployeeDto employeeDto){
        switch (employeeDto.getContractTypeName()) {
            case "HourlySalaryEmployee":
                return new HourlyEmployee(employeeDto.getId(), employeeDto.getName(), employeeDto.getRoleId(),
                        employeeDto.getRoleName(), employeeDto.getRoleDescription(), employeeDto.getHourlySalary(), 0);
            case "MonthlySalaryEmployee":
                return new MonthlyEmployee(employeeDto.getId(), employeeDto.getName(), employeeDto.getRoleId(),
                        employeeDto.getRoleName(), employeeDto.getRoleDescription(), employeeDto.getMonthlySalary(), 0);
            default:
                return null;
        }
    }
}

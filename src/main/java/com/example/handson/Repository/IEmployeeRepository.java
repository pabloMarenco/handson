package com.example.handson.Repository;

import com.example.handson.dto.EmployeeDto;

import java.util.List;

public interface IEmployeeRepository {

    public EmployeeDto getEmployeeByID(Long employeeID);

    public EmployeeDto[] getEmployees();

    public List<EmployeeDto> getListEmployees(List<Long> employeesID);
}

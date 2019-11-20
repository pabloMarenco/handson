package com.example.handson.usecases;

import com.example.handson.domain.Employee;
import com.example.handson.exception.ContractTypeNotValidException;

import java.util.List;

public interface IEmployeesFromRepository {

    public Employee getEmployeeByID(Long id) throws ContractTypeNotValidException;

    public List<Employee> getEmployees() throws ContractTypeNotValidException;
}

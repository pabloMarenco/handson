package com.example.handson.usecases;

import com.example.handson.Repository.EmployeeRepository;
import com.example.handson.domain.Employee;
import com.example.handson.exception.ContractTypeNotValidException;
import com.example.handson.utils.EmployeeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class SearchEmployees implements IEmployeesFromRepository {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeFactory employeeFactory;

    @Autowired
    CalculateEmployeeSalaryUseCase calculateEmployeeSalaryUseCase;

    @Override
    public Employee getEmployeeByID(Long id){
        return Arrays.stream(employeeRepository.getEmployees())
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .map(e -> calculateEmployeeSalaryUseCase.calculateSalary(employeeFactory.newEmployee(e)))
                .orElseThrow(ContractTypeNotValidException::new);
    }

    @Override
    public List<Employee> getEmployees(){
        return Arrays.stream(employeeRepository.getEmployees())
                .map(e -> calculateEmployeeSalaryUseCase.calculateSalary(employeeFactory.newEmployee(e)))
                .collect(Collectors.toList());
    }
}

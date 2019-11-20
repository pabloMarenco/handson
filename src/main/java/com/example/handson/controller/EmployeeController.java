package com.example.handson.controller;

import com.example.handson.domain.Employee;
import com.example.handson.exception.ContractTypeNotValidException;
import com.example.handson.usecases.SearchEmployees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    SearchEmployees searchEmployees;

    @GetMapping("/api/{id}")
    @ExceptionHandler({ContractTypeNotValidException.class})
    public Employee findEmployeeByID(@PathVariable("id") Long id) throws ContractTypeNotValidException {
        return searchEmployees.getEmployeeByID(id);
    }

    @GetMapping("/api")
    public List<Employee> findEmployeeByID() throws ContractTypeNotValidException {
        return searchEmployees.getEmployees();
    }
}

package com.example.handson.usecases;

import com.example.handson.domain.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CalculateEmployeeSalaryUseCaseTest {

    CalculateEmployeeSalaryUseCase calculateEmployeeSalaryUseCase;

    @Test
    public void shouldValidateAnnualSalaryCalculationForHourlyEmployee(){

        calculateEmployeeSalaryUseCase = new CalculateEmployeeSalaryUseCase();

        Employee employee = Employee.builder()
                .id(1L).name("Pablo").contractTypeName("MonthlySalaryEmployee").roleId(1).roleName("Contractor")
                .roleDescription("Descripction info").salary(6000.0).build();
        Assertions.assertEquals(72000.0,calculateEmployeeSalaryUseCase.calculateSalary(employee).getAnnualSalary());
    }
}

package com.example.handson.Repository;

import com.example.handson.dto.EmployeeDto;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Repository
public class EmployeeRepository implements IEmployeeRepository {

    RestOperations restTemplate;

    @Override
    public EmployeeDto getEmployeeByID(Long employeeID) {
        return null;
    }

    @Override
    public EmployeeDto[] getEmployees() {
        restTemplate = new RestTemplate();
        return restTemplate.getForEntity(
                "http://masglobaltestapi.azurewebsites.net/api/employees",
                EmployeeDto[].class).getBody();
    }

    @Override
    public List<EmployeeDto> getListEmployees(List<Long> employeesID) {
        return null;
    }
}

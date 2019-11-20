package com.example.handson.Repository;

import com.example.handson.dto.EmployeeDto;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Repository
public class EmployeeRepository implements IEmployeeRepository {

    RestOperations restTemplate;


    @Override
    public EmployeeDto[] getEmployees() {
        restTemplate = new RestTemplate();
        return restTemplate.getForEntity(
                "http://masglobaltestapi.azurewebsites.net/api/employees",
                EmployeeDto[].class).getBody();
    }

}

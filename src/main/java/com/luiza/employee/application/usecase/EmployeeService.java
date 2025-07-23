package com.luiza.employee.application.usecase;

import com.luiza.employee.domain.model.Employee;
import com.luiza.employee.domain.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository repository;

    public List<Employee> getAll(){
        return repository.findAll();
    }

}

package com.luiza.employee.application.usecase;

import com.luiza.employee.domain.model.Employee;
import com.luiza.employee.domain.model.EmployeeResponse;
import com.luiza.employee.domain.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository repository;

    public EmployeeResponse create(Employee employee){
        return repository.save(employee);
    }
    public List<Employee> getAll(){
        return repository.findAll();
    }

    public void delete(UUID id){
        repository.deleteById(id);
    }


}

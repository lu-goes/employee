package com.luiza.employee.application.usecase;

import com.luiza.employee.adapter.out.persistence.EmployeeJpaEntity;
import com.luiza.employee.domain.model.Employee;
import com.luiza.employee.domain.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository repository;

    public EmployeeJpaEntity create(Employee employee){
        return repository.save(employee);
    }
    public List<Employee> getAll(){
        return repository.findAll();
    }

    public void deleteById(UUID id){
        repository.deleteById(id);
    }


}

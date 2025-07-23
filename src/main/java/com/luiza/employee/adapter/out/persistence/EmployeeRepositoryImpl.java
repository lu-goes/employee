package com.luiza.employee.adapter.out.persistence;

import com.luiza.employee.domain.model.Employee;
import com.luiza.employee.domain.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final EmployeeJpaRepository jpaRepository;

    @Override
    public List<Employee> findAll(){
        return jpaRepository.findAll().stream()
                .map(entity -> new Employee(
                        entity.getName(),
                        entity.getEmail(),
                        entity.getDepartament()
                ))
                .toList();
    }


}

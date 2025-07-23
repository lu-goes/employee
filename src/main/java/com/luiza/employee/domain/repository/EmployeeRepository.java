package com.luiza.employee.domain.repository;

import com.luiza.employee.adapter.out.persistence.EmployeeJpaEntity;
import com.luiza.employee.domain.model.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeRepository {

    List<Employee> findAll();
}

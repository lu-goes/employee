package com.luiza.employee.adapter.in.web;

import com.luiza.employee.domain.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {


    @GetMapping
    public ResponseEntity<Employee> listAll(){
        return (ResponseEntity<Employee>) ResponseEntity.ok();
    }
}

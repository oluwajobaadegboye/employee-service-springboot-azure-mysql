package com.rpi.employeeservicespringbootazuremysql.controller;

import com.rpi.employeeservicespringbootazuremysql.entity.Employee;
import com.rpi.employeeservicespringbootazuremysql.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Employee findById(@PathVariable Long id) {
        return employeeService.findById(id);
    }

    @PostMapping
    public Employee createEmployee(Employee employee) {
        return employeeService.createEmployee(employee);
    }

//    @PutMapping
//    public Employee updateEmployee(Long id, Employee employee) {
//        return employeeService.updateEmployee(id, employee);
//    }
}

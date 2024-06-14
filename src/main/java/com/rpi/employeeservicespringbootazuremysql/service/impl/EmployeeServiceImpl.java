package com.rpi.employeeservicespringbootazuremysql.service.impl;

import com.rpi.employeeservicespringbootazuremysql.repository.EmployeeRepository;
import com.rpi.employeeservicespringbootazuremysql.entity.Employee;
import com.rpi.employeeservicespringbootazuremysql.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return repository.findById(id).orElse(Employee.builder().build());
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

//    @Override
//    public Employee updateEmployee(Long id, Employee employee) {
//        return repository.save();
//    }
}

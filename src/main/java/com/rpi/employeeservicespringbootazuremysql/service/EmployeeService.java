package com.rpi.employeeservicespringbootazuremysql.service;

import com.rpi.employeeservicespringbootazuremysql.entity.Employee;

import java.util.List;


public interface EmployeeService {
    public List<Employee> findAll();
    public Employee findById(Long id);

    public Employee createEmployee(Employee employee);

//    public Employee updateEmployee(Long id, Employee employee);
}

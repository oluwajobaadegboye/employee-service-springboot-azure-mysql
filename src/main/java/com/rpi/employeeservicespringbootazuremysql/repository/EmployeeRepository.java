package com.rpi.employeeservicespringbootazuremysql.repository;

import com.rpi.employeeservicespringbootazuremysql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

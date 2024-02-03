package com.HRMS.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.HRMS.HRMS.Entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}

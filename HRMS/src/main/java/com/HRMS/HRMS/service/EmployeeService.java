package com.HRMS.HRMS.service;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.HRMS.Entity.Employee;
import com.HRMS.HRMS.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepository;
	public Employee createEmployee(Employee employee) {
		return employeerepository.save(employee);
		
	}
	public Employee getEmployeeById(int id) {
		return employeerepository.findById(id).get();
		
	}
	public List <Employee> getAllEmployee() {
		return employeerepository.findAll();
	}
	public String deleteEmployeeById(int id) {
		 employeerepository.deleteById(id);
		 return "deletion successfull";
		
	}
	public Employee updateEmployeeById(Employee correctemployee, int id) {
		Employee employee= employeerepository.findById(id).get();
		if(employee.getName()!=null) {
			employee.setName(correctemployee.getName());
		}
		
		
		return employeerepository.save(employee);
	}

}

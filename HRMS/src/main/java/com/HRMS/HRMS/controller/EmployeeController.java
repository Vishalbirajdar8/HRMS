package com.HRMS.HRMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HRMS.HRMS.Entity.Employee;
import com.HRMS.HRMS.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
  @Autowired
  EmployeeService employeeservice;
  
  @PostMapping("/save")
  public Employee createEmployee(@RequestBody Employee employee) {
	return employeeservice.createEmployee(employee);
	  
  }
  @GetMapping("/find/{id}")
  public Employee getEmployeeById(@PathVariable int id) {
	return employeeservice.getEmployeeById(id);
	
 }
  @GetMapping("/findAll")
   public List <Employee> getAllEmployee(){
	return employeeservice.getAllEmployee();
	  
  }
  @DeleteMapping("/delete/{id}")
  public String deleteEmployeeById(@PathVariable int id) {
	return employeeservice. deleteEmployeeById(id);
	  
  }
  @PutMapping("/update/{id}")
  	public Employee updateEmployeeById(@RequestBody Employee employee,@PathVariable int id) {
  		return employeeservice.updateEmployeeById(employee, id);
  	}
 
  
  
  
}

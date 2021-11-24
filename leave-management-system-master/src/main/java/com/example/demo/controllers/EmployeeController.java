package com.example.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")

public class EmployeeController 
{
	
	 @Autowired
	 private EmployeeRepository employeeRepository;
	 // get employee 
	 
	 @GetMapping("/employees")
	 
	 public List<Employee> getAllEmployee() {
		
	return employeeRepository.findAll();
	 }
	//save employee
	  @PostMapping("/employees")
	  public Employee createEmployee( @RequestBody Employee employee) 
	  {
		System.out.println("enter employee details");
	    return employeeRepository.save(employee);
	  }
	 
	 
	  
	 
	 
}
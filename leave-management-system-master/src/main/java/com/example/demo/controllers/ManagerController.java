package com.example.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Manager;
import com.example.demo.repository.ManagerRepository;

@RestController
@RequestMapping("/api/v1")

public class ManagerController 
{
	
	 @Autowired
	 private ManagerRepository managerRepository;
	 // get employee 
	 
	 @GetMapping("/managers")
	 
	 public List<Manager> getAllManager() {
		
	return managerRepository.findAll();
	 }
	 
	 
	 
	//save employee
	  @PostMapping("/managers")
	  public Manager createManager( @RequestBody Manager manager) 
	  {
	    return managerRepository.save(manager);
	  }
	 
	  
	  @GetMapping("/manager")
	 public void manage()
	 {
		  
	 }
	 
	  
	 
	 
}
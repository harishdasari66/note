package com.example.demo.controllers;

import javax.persistence.*;

@Entity

@Table(name="employee")


public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
	
	@Column(name = "employeeName")
private String employeeName;
	
	@Column(name = "salary")
private String salary;
	
	@Column(name = "department")
private String department;
	
	@Column(name = "dojYear")
private String dojYear;
	
	@Column(name = "dob")
private String dob;
	
	@Column(name = "designation")
private String designation;
	

public long getId() {
	
	
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getEmployeeName() {

	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public String getSalary() {

	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getDojYear() {
	
	return dojYear;
}
public void setDojYear(String dojYear) {
	
	this.dojYear = dojYear;
}
public String getDob() {
	
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getDepartment() {
	
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getDesignation() {
	
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}


@Override
public String toString() {
	
    return "Employee{" +
            "id=" + id +
            ", EmployeeName='" + employeeName + '\'' +
            ", salary='" + salary + '\'' +
              ", department='" + department + '\'' +
              ", DojYear='" + dojYear + '\'' +
              ", dob='" + dob + '\'' +
                ", designation='" + designation +
            '}';
}


}

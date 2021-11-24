package com.example.demo.models;

import javax.persistence.*;

@Entity

@Table(name="manager")


public class Manager {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
	
	@Column(name = "managerName")
private String managerName;
	
	
	@Column(name = "department")
private String department;
	
	
	@Column(name = "designation")
private String designation;
	

public long getId() {
	
	
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getManagerName() {

	return managerName;
}
public void setEmployeeName(String managerName) {
	this.managerName =managerName;
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
	
    return "Manager{" +
            "id=" + id +
            ", ManagerName='" + managerName + '\'' +
            
              ", department='" + department + '\'' +
              
                ", designation='" + designation +
            '}';
}


}

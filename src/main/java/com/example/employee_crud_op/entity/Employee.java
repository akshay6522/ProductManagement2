package com.example.employee_crud_op.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data  //this annotation gives getter setter ,tostring ,hashcode equal  it means lombok removes boiler plate code 
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String empName;
	private String empAdress;
	

}

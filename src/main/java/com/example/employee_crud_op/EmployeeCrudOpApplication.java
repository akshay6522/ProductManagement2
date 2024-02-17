package com.example.employee_crud_op;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//(exclude = DataSourceAutoConfiguration.class) it is used to disable the database related operations 
public class EmployeeCrudOpApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudOpApplication.class, args);

		System.out.println(" Hey --> This is a Microservices Project ");
	}
  
}
  
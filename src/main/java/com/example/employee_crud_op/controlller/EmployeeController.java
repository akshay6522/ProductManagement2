package com.example.employee_crud_op.controlller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_crud_op.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	SessionFactory sessionfactory;

	@GetMapping(value = "getHEllo")
	public String getHelloWorld() {
		return "Hello World";
	}

	@PostMapping("added")
	public boolean addemployye(@RequestBody Employee employee) {
		boolean isAdded = false;
System.out.println("Akshay Aher");
		try {
			Session session = sessionfactory.openSession();
			session.save(employee);
			isAdded=true;
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isAdded;

	}
}

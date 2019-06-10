package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeServices {

	@Autowired
	private EmployeeRepo repo;
	
	public List<Employee> getEmployees() {
		return (List<Employee>) repo.findAll();
	}
}

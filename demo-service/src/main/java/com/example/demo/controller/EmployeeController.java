package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeServices;

@RestController
@RequestMapping
public class EmployeeController {

	@Autowired
	private EmployeeServices service;

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(path = "/skysthelimit", produces = "application/json")
	public List<Employee> getEmployees() {
		List<Employee> list = service.getEmployees();
		return list;
	}
}

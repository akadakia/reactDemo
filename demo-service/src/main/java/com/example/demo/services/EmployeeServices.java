package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeServices {

	@Autowired
	private EmployeeRepo repo;
	
	public List<Employee> getEmployees() {
		return (List<Employee>) repo.findAll();
	}
	
	public Employee createEmployee(final Employee e1) throws NullPointerException {
		try {
		if(!StringUtils.isEmpty(e1.getName())) {
		Employee emp = new Employee();
		emp.setId(e1.getId());
		emp.setName(e1.getName());
		emp.setRole(e1.getRole());
		emp.setSalary(e1.getSalary());
		return repo.save(emp);
		}
		}
		catch(NullPointerException e) {
			System.out.println(" missing input");
			throw e;
		}
		return null;
	}
	
}

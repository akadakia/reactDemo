package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	 Employee findByName(String name);
}

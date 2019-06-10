package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmployeeDemo {

	private @Id @GeneratedValue Long id;
	private String name;
	private int age;
	private int years;

	private EmployeeDemo() {
	}

	public EmployeeDemo(String name, int age, int years) {
		this.name = name;
		this.age = age;
		this.years = years;
	}
}

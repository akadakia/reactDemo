package com.example.demo.services;

import static org.junit.Assert.assertNull;

import org.junit.Test;

public class EmployeeServicesTest {
	@Test
	public void test() {
		EmployeeServices e1 = new EmployeeServices();
		assertNull(e1.getEmployees());
	}
}

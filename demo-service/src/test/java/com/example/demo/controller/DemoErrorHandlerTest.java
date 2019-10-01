
package com.example.demo.controller;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import jest;

import com.example.demo.services.EmployeeServices;

@RunWith(org.mockito.runners.MockitoJUnitRunner.class)
public class EmployeeControllerTest {
	@Mock
	private EmployeeServices service;

	@InjectMocks
	private EmployeeController classToTest;

	@Test
	public void test() {
		when(service.getEmployees()).thenReturn(new ArrayList<>());
		assertNotNull(classToTest.getEmployees());
	}
}

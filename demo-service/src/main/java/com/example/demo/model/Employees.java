package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employees {
	@JsonProperty("employees")
	private List<Employee> employees;
}

package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;

@ControllerAdvice
public class DemoErrorHandler {

	@ExceptionHandler(NullPointerException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse handle(NullPointerException npe) {
		System.out.println("I am here...");
		return new ErrorResponse("I am here - Npe");
	}

	@Getter
	public static class ErrorResponse {
		String message;

		public ErrorResponse(String message) {
			this.message = message;
		}
	}
}

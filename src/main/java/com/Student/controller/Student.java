package com.Student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
	@GetMapping("/student")
	public String detail() {
		return "name: amar"
				+ "class: 5th"
				+ "Roll No: 29"
				+ "branch: BE";
	}
}

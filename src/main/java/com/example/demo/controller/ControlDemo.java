package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class ControlDemo {
	@GetMapping("/getMapDemo")
	private String getMapDemo() {
		
		return "Hi All";
		
	}

	
	
	
	
	
}

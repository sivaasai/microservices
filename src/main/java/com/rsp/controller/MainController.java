package com.rsp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/aws")
	public String display() {
		
		return "Learning AWS Application";
	}
	
	@GetMapping("/")
	public String display1() {
		
		return "Welcome";
	}
	
	
	

}

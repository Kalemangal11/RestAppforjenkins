package com.bikkadIt.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GreetClass")
public class GreetController {

	@GetMapping("/GreetMsg")
	public String greetMsg() {
		String msg="Good Morning to All";
		return msg;
		
	}
	
	@GetMapping("/WelcomeMsg")
	public String welcomeMsg() {
		String msg="Welcome to BikkadIT";
		return msg;
		
	}
}

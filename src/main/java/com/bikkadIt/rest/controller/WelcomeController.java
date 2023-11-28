package com.bikkadIt.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.rest.model.Student;

@RestController
@RequestMapping("/welcomeController")
public class WelcomeController {

//Send "Http://localhost:8080/welcomeController/WelcomeMsg" this url for this method in Postman		
	//	@GetMapping("/WelcomeMsg")
	//	public ResponseEntity<String> welcomeMsg() {
	//		//int a=10/0;
	//		String msg="Welcome to BikkadIT";
	//		return new ResponseEntity<String>(msg,HttpStatus.OK);
	//	}

//Send "Http://localhost:8080/welcomeController/WelcomeStudent" this url for this method in Postman	
//and add key=Accept & value=applicatipon/json or value=applicatipon/json in postman (Headers)
	@GetMapping(value = "/WelcomeStudent", produces = {"application/xml","application/json"})
	//@GetMapping(value = "/WelcomeStudent", produces ="application/xml")
	public ResponseEntity<Student> welcomeStudent() {
		Student s = new Student();
		s.setSid(11);
		s.setSname("Mangal");
		return new ResponseEntity<Student>(s, HttpStatus.OK);
	}

//Send "Http://localhost:8080/welcomeController/getStudents" this url for this method in Postman		
	//	@GetMapping("/getStudents")
	//	public ResponseEntity<List<Student>> getStudents() {
	//		Student s=new Student();
	//		s.setSid(11);
	//		s.setSname("Mangal");
	//		
	//		Student s1=new Student();
	//		s1.setSid(22);
	//		s1.setSname("Mahi");
	//		
	//		List l=new ArrayList();
	//		l.add(s);
	//		l.add(s1);
	//		return new ResponseEntity<List<Student>>(l,HttpStatus.OK);
	//		}

//Send "Http://localhost:8080/welcomeController/WelcomeMsg1" this url for this method in Postman	
	//	@GetMapping("/WelcomeMsg1")
	//	public String welcomeMsg1() {
	//		String msg="Welcome to BikkadIT123";
	//		return msg;}

}

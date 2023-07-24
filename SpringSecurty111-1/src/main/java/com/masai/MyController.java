package com.masai;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/hello")
public String name() {
	return "kanhaiya";
}
	@GetMapping("/welcomeP")
	public ResponseEntity<String> welcomeP(){
	return new ResponseEntity<String>("Welcome to Masai App with Security",HttpStatus
	.ACCEPTED);
	
	
	}
	
	@GetMapping("/welcomed")
	public ResponseEntity<String> welcomed(){
	return new ResponseEntity<String>("kanhaiya",HttpStatus
	.ACCEPTED);
	
	
	}
}

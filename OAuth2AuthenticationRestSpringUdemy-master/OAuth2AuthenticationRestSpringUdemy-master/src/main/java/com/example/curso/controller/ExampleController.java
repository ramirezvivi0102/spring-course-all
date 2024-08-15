package com.example.curso.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/testing")
public class ExampleController {
	
	 @GetMapping("/hello")
	 public String movimientos(){
		 return "hello-test";
	 }

}

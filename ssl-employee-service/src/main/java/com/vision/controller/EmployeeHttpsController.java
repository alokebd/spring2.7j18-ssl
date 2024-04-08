package com.vision.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeHttpsController {
	
 @GetMapping("/hello")
 public String createSSLResponse() {
	 return "Response received from HTTPS server";
 }
}

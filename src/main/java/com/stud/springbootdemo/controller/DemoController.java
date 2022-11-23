package com.stud.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RequestMapping("/")
@RestController
public class DemoController {

	@GetMapping
	public String  getApi() {
		return "Hi this is Spring boot app deployed on Azure App service";
	}
}

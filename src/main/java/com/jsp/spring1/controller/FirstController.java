package com.jsp.spring1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {


	@RequestMapping("/first")
	public void firstApi() {
		
		System.out.println("first API");
	}
}

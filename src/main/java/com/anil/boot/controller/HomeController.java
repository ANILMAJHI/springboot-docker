package com.anil.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/view")
	public String viewPage()
	{
		return "view Page here integrate with docker and jenkins...";
	}
}

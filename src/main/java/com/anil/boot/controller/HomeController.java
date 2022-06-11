package com.anil.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/view")
	public String viewPage()
	{
		return "view Page here...";
	}
	
	@GetMapping("/info")
	public String getDetailsInfo()
	{
		return "find the all the information";
	}
	
	@GetMapping("/gitDev")
	public String testGitStatus()
	{
		return "Marge the dev code to the master in git...";
	}
}

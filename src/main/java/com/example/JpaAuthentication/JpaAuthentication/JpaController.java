package com.example.JpaAuthentication.JpaAuthentication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaController {
	
	@RequestMapping("/")
	public String publicAccess() 
	{
		return ("<hi>Hiiii......Welcome To Excellence Classes</h1>");
		
	}
	
	@RequestMapping("/User")
	public String userAccess() 
	{
		return ("<hi>Hiiii......Welcome User</h1>");
		
	}
	@RequestMapping("/AdminAccess")
	public String adminAccess() 
	{
		return ("<hi>Hiiii......Welcome Admin</h1>");
		
	}

}

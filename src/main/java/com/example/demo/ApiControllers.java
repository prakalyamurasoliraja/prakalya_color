package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiControllers {
	String str1="Red";
	@GetMapping("/game")
	public String getMyFav()
	{
		return "My favourite color is "+str1;
	}

}

package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello(){
		System.out.println("Welome to Spring");
			return "ffo";
	}
}

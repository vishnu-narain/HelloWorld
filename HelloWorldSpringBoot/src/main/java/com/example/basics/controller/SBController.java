package com.example.basics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SBController {
@RequestMapping({"/","/hello"})
public String home()
{
	System.out.println("Hello World of Spring Boot");
	return "home";
}
}

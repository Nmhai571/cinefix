package com.cybersoft.cinefix.controller;

import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller là dành cho việc mình làm web java
//@RestController à dành để viết API (Viết chương trình sau đó chạy postman)

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("")
	public ModelAndView home() {
		ModelAndView andView = new ModelAndView("home");
		int a = 10;
		int b = 20;
		
		int sum = TinhTong(a, b);
		
		andView.addObject("tong", sum);
		return andView;
	}
	
	private int TinhTong(int a, int b) {
		int tong = 0;
		tong = a+b;
		return tong;
	}
}

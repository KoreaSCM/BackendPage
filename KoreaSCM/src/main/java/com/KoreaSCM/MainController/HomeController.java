package com.KoreaSCM.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping({"/", "/home" })
	public String home() {
		return "home";
	}
	
	@GetMapping("/404")
	public String notFound() {
		return "404";
	}
	
	@GetMapping("/blank")
	public String blank() {
		return "blank";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}

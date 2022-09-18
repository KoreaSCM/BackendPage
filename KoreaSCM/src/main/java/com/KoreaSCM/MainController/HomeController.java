package com.KoreaSCM.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/404")
	public String notFound() {
		return "404";
	}
	
	@GetMapping("/blank")
	public String blank() {
		return "blank";
	}
}

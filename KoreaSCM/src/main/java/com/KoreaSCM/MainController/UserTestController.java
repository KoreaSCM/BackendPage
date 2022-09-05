package com.KoreaSCM.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.KoreaSCM.Main.User;

@Controller
public class UserTestController {
	@GetMapping("/test")
    public String getUser(Model model) {
        User user = new User("kkaok", "테스트", "web");
        model.addAttribute("user", user);
        return "test";
    }
}

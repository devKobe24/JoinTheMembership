package com.kobe.jointhemembership.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginViewController {
	@GetMapping("/user/logout")
	public String logout() {
		return "logout";
	}
}

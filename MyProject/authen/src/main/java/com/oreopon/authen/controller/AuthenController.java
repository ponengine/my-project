package com.oreopon.authen.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenController {

	@GetMapping("/")
	public String msg() {
		return "Hello";
	}
	
	@GetMapping("/private")
	@PreAuthorize("hasRole('ROLE_USER')")
	public String msgprivate() {
		return "Hello Private";
	}
}

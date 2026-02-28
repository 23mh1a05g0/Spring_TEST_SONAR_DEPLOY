package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/cseadd")
	public int addCSE(@RequestParam int a, @RequestParam int b) {
		return a + b;
	}
	@GetMapping("/Roll_No")
	public String roll() {
		return "Hello, my roll number is 23MH1A05G0.";
	}
	
}
package com.github.actions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("/welcome")
	public String welcome(){
		return "Welcome to java techie";
	}
}

package com.example.demo.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	static int count = 10;
	@Scheduled(fixedRate = 60000)
	@GetMapping("/test")
	public String test() {
		count += 1;
		return "<h1>TestMessage"+count+"</h1>";
	}
	
}

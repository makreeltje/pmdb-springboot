package com.pmdb.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiApplication {

	@GetMapping("/")
	public String home() {
		return "Hello World from pmdb";
	}


	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}

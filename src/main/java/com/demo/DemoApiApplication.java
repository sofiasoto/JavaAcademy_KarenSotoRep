package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApiApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello(){
		return "Hello World Spring!";
	}

	@GetMapping("/all")
	public String fetchAllTask(){
		return "[] returning all task";
	}

	@PostMapping("/save")
	public String postTask(){
		return "saving ";
	}

	@DeleteMapping("/delete")
	public String deleteTask(){
		return "deleting ";
	}

	@PutMapping("/update")
	public String putTask(){
		return "updating ";
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MyApp {

	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
		System.out.println("............server satrt in ocalhost:1234 .............");
	}

}

package com.future_vending.backend_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BackendServerApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(BackendServerApplication.class, args);
	}
}

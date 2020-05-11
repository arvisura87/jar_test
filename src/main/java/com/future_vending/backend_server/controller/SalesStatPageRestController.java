package com.future_vending.backend_server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/backend_server")
public class SalesStatPageRestController {
	
	//Get all sales data for the sales stat page
	@GetMapping("sales_stats")
	public ResponseEntity getSalesStats() {
		return (ResponseEntity) ResponseEntity.ok();
	}
}

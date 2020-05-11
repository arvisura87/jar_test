package com.future_vending.backend_server.controller;

import com.future_vending.backend_server.dto.DevicesPageDTO;
import com.future_vending.backend_server.service.DevicesPageService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class DevicesPageRestController {
	
	@RestController
	@RequestMapping("/api/v1/backend_server")
	@AllArgsConstructor
	public class SalesStatPageRestController {
		
		private final DevicesPageService devicesPageService;
		
		//Get all data for the devices page
		@GetMapping("devices")
		public DevicesPageDTO getAllDevices() {
			return devicesPageService.getAll();
			}
	}
}

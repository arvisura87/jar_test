package com.future_vending.backend_server.service;

import com.future_vending.backend_server.dto.DevicesPageDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class DevicesPageServiceImpl implements DevicesPageService {
	
	@Override
	public DevicesPageDTO getAll() {
		//TODO
		//segedmetodus osszeallitani az oldalhoz szukseges adatokat
		
		return new DevicesPageDTO();
	}
}

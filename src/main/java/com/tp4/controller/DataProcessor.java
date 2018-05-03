package com.tp4.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.services.BrowsingDataService;
import com.tp4.entities.BrowsingData;

public class DataProcessor {
	List<BrowsingData> data;
	@GetMapping(value = "/consulta/")
	public String returnInfo() {
		BrowsingDataService service = new BrowsingDataService();
		
		this.data = service.getAll();
		
		BrowsingData combo = service.getHighestCombination(data);
		
		String response = "Browser más usado = " + service.getHighestBrowser(data) +
				"; SO más usado = " + service.getHighestOS(data) +
				"; Combinación más común = " + combo.getBrowser() + " y " + combo.getOs();
		
		return response;
	}
}

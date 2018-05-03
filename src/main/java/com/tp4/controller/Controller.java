package com.tp4.controller;

import java.text.ParseException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.services.BrowsingDataService;
import eu.bitwalker.*;



@RestController
public class Controller {
	@GetMapping(value = "/")
	public String getInfo(@RequestHeader("User-Agent") String userAgent) throws ParseException {		
		UserAgent agent = UserAgent.parseUserAgentString(userAgent);
		String stringifiedAgent = String.valueOf("");
		
		String[] segments = stringifiedAgent.split("-");
		String browser = segments[0];
		String os = segments[1];
		
		BrowsingDataService service = new BrowsingDataService();
		
		service.newData(browser, os);
		
		return "Info gathered";
	}
}

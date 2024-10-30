package com.ssucode.rest.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value = {"classpath:/application.yml"})
public class ApiController {
	
	@Value("${spring.profiles.active}")
	private String profile;
	
	@RequestMapping("/")
	public String home() {
		return "SSUCODE "+ profile.toUpperCase() + " REST API!";
	}
}

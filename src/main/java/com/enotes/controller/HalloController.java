package com.enotes.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HalloController {
	
	 @GetMapping("/")
	public String Hoppital() {
		 return "Haloo" ;
	}

}

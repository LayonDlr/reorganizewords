package com.luis.lay.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.lay.service.ServiceWords;


@RestController
@RequestMapping("/reorganize-words")
public class Controller {

	private ServiceWords service;
	
	@PostMapping
	public String post() {
		return 
		
	}
}

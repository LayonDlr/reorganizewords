package com.luis.lay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reorganize")
public class ControllerReorganize {

	@Autowired
	private ServiceReorganize service;
	
	  @PostMapping
	    public String reorganizeWords(@RequestBody String input) {
	        return service.organiza(input);
	    }
	
}

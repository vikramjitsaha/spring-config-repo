package com.vikram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroServiceController {

	@Value("${welcome}")
	private String valueFromFile;
    
    @Autowired
    Environment env;

    @GetMapping("/endpoint")
    public String retrieveLimits(){
    	String output = valueFromFile == null || valueFromFile.isEmpty() ? env.getProperty("welcome") : valueFromFile;
    	return output;
    }
}
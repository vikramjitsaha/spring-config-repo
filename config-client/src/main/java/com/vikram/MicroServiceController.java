package com.vikram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroServiceController {

    @Autowired
    Configuration configuration;
    
    @Autowired
    Environment env;

    @GetMapping("/endpoint")
    public String retrieveLimits(){
    	String v1 = configuration.getWelcome();
    	String v2 = env.getProperty("welcome");
    	
        return v2;
    }
}
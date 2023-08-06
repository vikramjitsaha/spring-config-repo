package com.vikram;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("file")
@org.springframework.context.annotation.Configuration
public class Configuration {
	private String welcome;

	public String getWelcome() {
		return welcome;
	}

	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}

	
}
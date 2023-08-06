package com.vikram;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("file")
@org.springframework.context.annotation.Configuration
public class Configuration {
	private String welcome;

	public String getValue() {
		return welcome;
	}

	public void setValue(String value) {
		this.welcome = value;
	}
}
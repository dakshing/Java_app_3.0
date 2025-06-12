package com.minikube.sample.properties;

import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "app.data")
@Getter
@Setter
public class PropertiesConfig {

	private String test;
	private String name;

	public String getTest() {
		return test;
	}

	public String getName() {
		return name;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public void setName(String name) {
		this.name = name;
	}
}

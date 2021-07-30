package com.flamexander.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class GeekEurekaClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(GeekEurekaClientApplication.class, args);
	}
}


package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.db.DatabaseConnection;

@Configuration
@ComponentScan(basePackages="com.example")
public class AppConfig {

	@Bean(initMethod = "init", destroyMethod = "cleanup")
	public DatabaseConnection connection() {
		return new DatabaseConnection();
	}
}

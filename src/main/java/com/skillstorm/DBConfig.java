package com.skillstorm;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class DBConfig { 
	@Bean 
	public DataSource dataSource() { 
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create(); 
		dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver"); 
		dataSourceBuilder.url("jdbc:mysql://localhost:3306/warehouses"); 
		dataSourceBuilder.username("root"); 
		dataSourceBuilder.password("Volley-ball3"); 
		return dataSourceBuilder.build(); 
		} 
	}
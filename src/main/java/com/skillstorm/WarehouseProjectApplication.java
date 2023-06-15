package com.skillstorm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@ComponentScan(basePackages={"com.skillstorm.repositories", "com.skillstorm.contollers", "com.skillstorm.models"})
public class WarehouseProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseProjectApplication.class, args);
	}

}

package com.delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories("com.delivery.repository")
public class ProductShowcaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductShowcaseServiceApplication.class, args);
	}

}

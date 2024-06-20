package com.delivery.productshowcaseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@ComponentScan("com.delivery")
@EnableJdbcRepositories("com.delivery.repository")
public class ProductShowcaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductShowcaseServiceApplication.class, args);
	}

}

package com.delivery.productshowcaseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.delivery")
public class ProductShowcaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductShowcaseServiceApplication.class, args);
	}

}

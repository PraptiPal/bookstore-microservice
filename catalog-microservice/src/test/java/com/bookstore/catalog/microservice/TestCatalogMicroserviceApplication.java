package com.bookstore.catalog.microservice;

import org.springframework.boot.SpringApplication;

public class TestCatalogMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.from(CatalogMicroserviceApplication::main)
				.with(TestcontainersConfiguration.class)
				.run(args);
	}

}

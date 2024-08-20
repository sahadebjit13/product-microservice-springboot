package com.example.product_rest_api_my_sql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ProductRestApiMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRestApiMySqlApplication.class, args);
	}

}

package com.brij.productCatelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.brij")
public class ProductCatelogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatelogApplication.class, args);
	}

}

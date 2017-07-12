package com.example.angulardemo.configs;

import com.example.angulardemo.controllers.ProductController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ProductController.class, SwaggerConfig.class})
public class AngulardemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngulardemoApplication.class, args);
	}

}

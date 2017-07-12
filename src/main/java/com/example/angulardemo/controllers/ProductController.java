package com.example.angulardemo.controllers;

import com.example.angulardemo.models.Product;
import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(value = "Product Controller")
@RestController
@RequestMapping("/api")
public class ProductController {

	private List<Product> products = new ArrayList();

	public ProductController() {
		products.add(new Product(0, "First prod", 60.00));
		products.add(new Product(1, "Second prod", 30.00));
		products.add(new Product(2, "Third prod", 40.00));
	}

	@RequestMapping(value = "products", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProducts() {
		return products;
	}
}

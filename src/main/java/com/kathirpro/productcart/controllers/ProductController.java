package com.kathirpro.productcart.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kathirpro.productcart.models.Product;
import com.kathirpro.productcart.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	@GetMapping("/category")
	public List<Map<String,Object>> getCategoryProducts() {
		return Arrays.asList(
				Map.of("name","asus laptop","price",23000),
				Map.of("name","Hp laptop","price",29000)
				);
	}
}

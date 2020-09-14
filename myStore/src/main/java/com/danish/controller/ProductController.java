package com.danish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danish.model.Product;
import com.danish.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController 
{
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public ResponseEntity<Object> getAllProducts()
	{
		List<Product> products = productService.getAllProducts();
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
	@PostMapping("/")
	public ResponseEntity<Product> addProduct(@RequestBody Product product)
	{
		Product products = productService.addProduct(product);
		return new ResponseEntity<>(products,HttpStatus.CREATED);
	}
}

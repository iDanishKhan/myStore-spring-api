package com.danish.service;

import java.util.List;

import com.danish.model.Product;

public interface ProductService {

	public List<Product> getAllProducts();

	public Product addProduct(Product product);

}

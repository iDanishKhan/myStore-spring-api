package com.danish.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danish.dao.ProductDao;
import com.danish.model.Product;
import com.danish.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService
{
	
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getAllProducts() {
		return productDao.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		Product productObj = productDao.save(product);
		return productObj;
	}
}
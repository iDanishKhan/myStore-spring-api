package com.danish.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String productName;
	private String productDesc;
	private boolean stock;
	private String price;
	
	public Product() 
	{
		
	}
	
	public Product(int productId, String productName, String productDesc, boolean stock, String price) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.stock = stock;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", stock=" + stock + ", price=" + price + "]";
	}
	
	
}

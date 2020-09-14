package com.danish.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetail
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderDetailId;
	private int productId;
	private String quantity;
	private String amount;
	private int orderId;
	
	public OrderDetail() 
	{
		
	}
	
	public OrderDetail(int orderDetailId, int productId, String quantity, String amount, int orderId) 
	{
		super();
		this.orderDetailId = orderDetailId;
		this.productId = productId;
		this.quantity = quantity;
		this.amount = amount;
		this.orderId = orderId;
	}
	
	public int getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
	public int getProductId() 
	{
		return productId;
	}
	public void setProductId(int productId) 
	{
		this.productId = productId;
	}
	public String getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(String quantity) 
	{
		this.quantity = quantity;
	}
	public String getAmount() 
	{
		return amount;
	}
	public void setAmount(String amount) 
	{
		this.amount = amount;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}	
}

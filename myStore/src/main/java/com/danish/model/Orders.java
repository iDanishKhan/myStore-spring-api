package com.danish.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "orders")
public class Orders 
{
	@Id
	private int orderId;
	private int userId;
	
	public Orders() 
	{
		
	}
	
	public Orders(int orderId, int userId) 
	{
		super();
		this.orderId = orderId;
		this.userId = userId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}

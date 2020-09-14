package com.danish.service;

import java.util.List;

import com.danish.model.Orders;

public interface OrderService  
{
	public List<Orders> getAllOrders();

	public Orders addOrders(Orders order);

}

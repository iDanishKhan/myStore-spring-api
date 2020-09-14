package com.danish.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danish.dao.OrdersDao;
import com.danish.model.Orders;
import com.danish.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService
{
	@Autowired OrdersDao orderDao;
	
	@Override
	public List<Orders> getAllOrders() 
	{
		return orderDao.findAll();
	}

	@Override
	public Orders addOrders(Orders order) 
	{
		Orders ordersObj = orderDao.save(order);
		return ordersObj;
	}

}

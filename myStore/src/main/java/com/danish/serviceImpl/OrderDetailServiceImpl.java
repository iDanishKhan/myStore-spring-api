package com.danish.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danish.dao.OrderDetailDao;
import com.danish.model.OrderDetail;
import com.danish.service.OrderDetailService;

@Service
@Transactional
public class OrderDetailServiceImpl implements OrderDetailService
{
	@Autowired
	private OrderDetailDao orderDetailDao;

	@Override
	public List<OrderDetail> getAllOrderDetails() 
	{
		return orderDetailDao.findAll();
	}

	@Override
	public OrderDetail addOrderDetails(OrderDetail orderDetail) {
		OrderDetail oDetailObj = orderDetailDao.save(orderDetail);
		return oDetailObj;
	}

}

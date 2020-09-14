package com.danish.service;

import java.util.List;

import com.danish.model.OrderDetail;

public interface OrderDetailService {

	public List<OrderDetail> getAllOrderDetails();

	public OrderDetail addOrderDetails(OrderDetail orderDetail);

}

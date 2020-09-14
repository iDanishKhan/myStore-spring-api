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

import com.danish.model.Orders;
import com.danish.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrdersController 
{
	@Autowired OrderService orderService;
	
	@GetMapping("/")
	public ResponseEntity<Object> getAllOrders()
	{
		List<Orders> orders = orderService.getAllOrders();
		return new ResponseEntity<>(orders,HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<Object> addOrders(@RequestBody Orders order)
	{
		Orders orders = orderService.addOrders(order);
		return new ResponseEntity<>(orders,HttpStatus.CREATED);
	}
}

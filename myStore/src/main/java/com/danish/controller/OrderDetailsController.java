
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

import com.danish.model.OrderDetail;
import com.danish.service.OrderDetailService;

@RestController

@RequestMapping("/orderdetails")
public class OrderDetailsController {

	@Autowired
	private OrderDetailService orderDetailService;

	@GetMapping("/")
	public ResponseEntity<Object> getAllOrderDetails() {
		List<OrderDetail> orderDetails = orderDetailService.getAllOrderDetails();
		return new ResponseEntity<>(orderDetails, HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<OrderDetail> addOrderDetails(@RequestBody OrderDetail orderDetail) {
		OrderDetail orderDetails = orderDetailService.addOrderDetails(orderDetail);
		return new ResponseEntity<>(orderDetails, HttpStatus.CREATED);
	}
}

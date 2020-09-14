package com.danish.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danish.model.OrderDetail;

@Repository
public interface OrderDetailDao extends JpaRepository<OrderDetail, Integer>
{

}

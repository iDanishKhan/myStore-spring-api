package com.danish.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danish.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>
{

}

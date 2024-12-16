package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.OrderItems;

public interface OrderItemsDao extends JpaRepository<OrderItems, Integer>{

}

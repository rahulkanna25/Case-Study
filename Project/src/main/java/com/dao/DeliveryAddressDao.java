package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.DeliveryAddress;

public interface DeliveryAddressDao extends JpaRepository<DeliveryAddress, Integer>{

}

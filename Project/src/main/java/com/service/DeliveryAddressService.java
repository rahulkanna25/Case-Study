package com.service;


import com.dao.DeliveryAddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.DeliveryAddress;

import java.util.List;

@Service
public class DeliveryAddressService {

    @Autowired
    private DeliveryAddressDao deliveryAddressdao;

    public List<DeliveryAddress> getAllAddresses() {
        return deliveryAddressdao.findAll();
    }

    public DeliveryAddress addDeliveryAddress(DeliveryAddress address) {
        return deliveryAddressdao.save(address);
    }
}
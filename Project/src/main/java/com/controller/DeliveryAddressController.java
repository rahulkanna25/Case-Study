package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.DeliveryAddress;
import com.service.DeliveryAddressService;

import java.util.List;

@RestController
@RequestMapping("/api/delivery-addresses")
public class DeliveryAddressController {

    @Autowired
    private DeliveryAddressService deliveryAddressService;

    @GetMapping
    public List<DeliveryAddress> getAllAddresses() {
        return deliveryAddressService.getAllAddresses();
    }

    @PostMapping
    public DeliveryAddress addDeliveryAddress(@RequestBody DeliveryAddress address) {
        return deliveryAddressService.addDeliveryAddress(address);
    }
}

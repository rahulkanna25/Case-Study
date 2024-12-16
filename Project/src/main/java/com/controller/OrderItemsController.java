package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.OrderItems;
import com.service.OrderItemsService;

import java.util.List;

@RestController
@RequestMapping("/api/order-items")
public class OrderItemsController {

    @Autowired
    private OrderItemsService orderItemsService;

    @GetMapping
    public List<OrderItems> getAllOrderItems() {
        return orderItemsService.getAllOrderItems();
    }

    @PostMapping
    public OrderItems addOrderItem(@RequestBody OrderItems orderItem) {
        return orderItemsService.addOrderItem(orderItem);
    }
}

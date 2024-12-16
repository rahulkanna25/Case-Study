package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrderItemsDao;

import java.util.List;
import com.model.OrderItems;
@Service
public class OrderItemsService {

    @Autowired
    private OrderItemsDao orderItemsdao;

    public List<OrderItems> getAllOrderItems() {
        return orderItemsdao.findAll();
    }

    public OrderItems addOrderItem(OrderItems orderItem) {
        return orderItemsdao.save(orderItem);
    }
}

package com.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="orderitems")

public class OrderItems {

	@Id
	@Column(name="order_item_id")
	private int orderItemId;
	
	@Column(name="quantity")
	private int quantity;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="item_id")
	private MenuItems menuItems;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Orders orders;
	
	

	public OrderItems() {
		super();
		// TODO Auto-generated constructor stub
	}



	public OrderItems(int orderItemId, int quantity, MenuItems menuItems, Orders orders) {
		super();
		this.orderItemId = orderItemId;
		this.quantity = quantity;
		this.menuItems = menuItems;
		this.orders = orders;
	}



	// toString()
	@Override
	public String toString() {
		return "OrderItems [order_item_id=" + orderItemId + ", quantity=" + quantity + "]";
	}
}
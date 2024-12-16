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
@Table(name="deliveryaddresses")

public class DeliveryAddress {

	@Id
	@Column(name="address_id")
	private int addressId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private Customers customers;
	
	@Column(name="address_line1")
	private String addressLine1;
	
	@Column(name="address_line2")
	private String addressLine2;
	
	@Column(name="city", length=100)
	private String city;
	
	@Column(name="state", length=100)
	private String state;
	
	@Column(name="postal_code", length=20)
	private String postalCode;
	
	
	
	
	

	public DeliveryAddress() {
		super();
		// TODO Auto-generated constructor stub
	}




	public DeliveryAddress(int addressId, String addressLine1, String addressLine2, String city, String state,
			String postalCode, Customers customers) {
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.customers = customers;
	}




	// toString()
	@Override
	public String toString() {
		return "DeliveryAddresses [address_id=" + addressId + ", address_line1=" + addressLine1 + ", address_line2=" + addressLine2 + ", city=" + city + ", state=" + state + ", postal_code=" + postalCode + "]";
	}
}

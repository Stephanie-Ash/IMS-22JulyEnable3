package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {
	private Long id;
	private String orderNumber;
	private Customer customer;
	
	public Order(String orderNumber, Customer customer) {
		this.orderNumber = orderNumber;
		this.customer = customer;
	}

	public Order(Long id, String orderNumber, Customer customer) {
		this.id = id;
		this.orderNumber = orderNumber;
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "id: " + id + " orderNumber: " + orderNumber + " customer: " + customer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer, id, orderNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(customer, other.customer) && Objects.equals(id, other.id)
				&& Objects.equals(orderNumber, other.orderNumber);
	}

}

package com.corejsf;

import java.io.Serializable;

public class Orders implements Serializable {

	private static final long serialVersionUID = 1L;

	private String orderNumber;
	private String orderDate;
	private String customerId;
	private String amount;
	private String description;

	public Orders(String orderNumber, String orderDate, String customerId,
			String amount, String description) {
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.customerId = customerId;
		this.amount = amount;
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getAmount() {
		return amount;
	}

	public String getDescription() {
		return description;
	}
}

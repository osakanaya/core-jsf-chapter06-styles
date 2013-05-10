package com.corejsf;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class TableData implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Orders[] orders = {
		new Orders("1", "2002-05-20", "1", "129.99", "Wristwatch"),
		new Orders("2", "2002-05-21", "1", "19.95", "Coffee grinder"),
		new Orders("3", "2002-05-24", "1", "29.76", "Bath towel"),
		new Orders("4", "2002-05-23", "1", "39.34", "Deluxe cheese burger"),
		new Orders("5", "2002-05-22", "2", "56.75", "Champagne glass set")
	};
	
	public Orders[] getOrders() {
		return orders;
	}
}

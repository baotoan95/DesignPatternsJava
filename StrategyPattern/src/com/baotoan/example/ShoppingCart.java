package com.baotoan.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<>();
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}

	private int getMount() {
		int total = 0;
		for(Item item : items) {
			total += item.getQuantity();
		}
		return total;
	}
	
	public void pay(PaymentStrategy paymentStrategy) {
		paymentStrategy.pay(getMount());
	}
}

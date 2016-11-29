package com.baotoan.example;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		items.add(new Item("AC", 5, 3523));
		items.add(new Item("AC", 3, 3523));
		items.add(new Item("AC", 4, 3523));
		items.add(new Item("AC", 6, 3523));
		
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.setItems(items);
		shoppingCart.pay(new PayPalStrategy("baotoan@gmail.com", "****"));
		
		shoppingCart.pay(new CreditCartStrategy("baotoan", "SD345DFS3", "SDFADS"));
	}
}

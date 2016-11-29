package com.baotoan.example;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<ItemElement> items = new ArrayList<>();
		items.add(new Book(23, "SDF4"));
		items.add(new Book(57, "SDF4"));
		items.add(new Book(23, "SDF4"));
		items.add(new Fruit("Banana", 3, 42));
		items.add(new Fruit("Orange", 2, 53));
		
		System.out.println(getCost(items));
	}
	
	private static int getCost(List<ItemElement> items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int cost = 0;
		for(ItemElement item : items) {
			cost += item.accept(visitor);
		}
		return cost;
	}
}

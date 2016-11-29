package com.baotoan.example;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		if(book.getPrice() > 50) {
			return book.getPrice() - 5;
		} else {
			return book.getPrice();
		}
	}

	@Override
	public int visit(Fruit fruit) {
		return fruit.getPricePerKg() * fruit.getWeight();
	}
	
}

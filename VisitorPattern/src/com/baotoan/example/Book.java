package com.baotoan.example;

public class Book implements ItemElement {
	private int price;
	private String isBnNumber;

	public Book(int price, String isBnNumber) {
		super();
		this.price = price;
		this.isBnNumber = isBnNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsBnNumber() {
		return isBnNumber;
	}

	public void setIsBnNumber(String isBnNumber) {
		this.isBnNumber = isBnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}

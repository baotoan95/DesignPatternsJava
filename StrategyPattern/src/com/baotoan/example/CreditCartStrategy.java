package com.baotoan.example;

public class CreditCartStrategy implements PaymentStrategy {
	private String name;
	private String cartNumber;
	private String cvv;

	public CreditCartStrategy(String name, String cartNumber, String cvv) {
		super();
		this.name = name;
		this.cartNumber = cartNumber;
		this.cvv = cvv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCartNumber() {
		return cartNumber;
	}

	public void setCartNumber(String cartNumber) {
		this.cartNumber = cartNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	@Override
	public void pay(int mount) {
		System.out.println(mount + " pay by credit cart");
	}

}

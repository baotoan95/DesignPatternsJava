package com.baotoan.example;

public class PayPalStrategy implements PaymentStrategy {
	private String email;
	private String password;

	public PayPalStrategy(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void pay(int mount) {
		System.out.println(mount + " pay by paypal");
	}

}

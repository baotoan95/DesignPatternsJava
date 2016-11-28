package com.baotoan.example;

public class Test {
	public static void main(String[] args) {
		Car car = new LuxuryCar(new SportCar(new BasicCar()));
		
		car.assemble();
	}
}

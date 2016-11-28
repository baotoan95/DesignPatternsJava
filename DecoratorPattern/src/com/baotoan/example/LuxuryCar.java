package com.baotoan.example;

public class LuxuryCar extends DecoratorCar {

	public LuxuryCar(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.print("Luxury car.");
	}

}

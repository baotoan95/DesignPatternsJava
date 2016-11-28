package com.baotoan.example;

public class Test {
	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("Sony", "DDR3").build();
		System.out.println(computer);
		
		Computer computer2 = new Computer.ComputerBuilder("Samsung", "DDR3").setBluetoothEnable(true).setGraphicCardEnable(true).build();
		System.out.println(computer2);
		
		Computer computer3 = new Computer.ComputerBuilder("Samsung", "DDR3").setBluetoothEnable(true).setGraphicCardEnable(false).build();
		System.out.println(computer3);
	}
}

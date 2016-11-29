package com.baotoan.nonpattern;

public class TVRemote {
	private String state = "";
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void doAction() {
		if(state.equals("ON")) {
			System.out.println("TV is turned on");
		} else {
			System.out.println("TV is turned off");
		}
	}
	
	public static void main(String[] args) {
		TVRemote tv = new TVRemote();
		tv.setState("ON");
		tv.doAction();
		
		tv.setState("OFF");
		tv.doAction();
	}
}

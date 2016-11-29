package com.baotoan.example;

public class Test {
	public static void main(String[] args) {
		TVContext tv = new TVContext();
		
		State stateOn = new TVStartState();
		State stateOff = new TVStopState();
		
		tv.setState(stateOn);
		tv.doAction();
		
		tv.setState(stateOff);
		tv.doAction();
	}
}

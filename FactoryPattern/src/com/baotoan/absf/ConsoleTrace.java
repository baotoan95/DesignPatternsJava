package com.baotoan.absf;

public class ConsoleTrace extends Trace {

	public ConsoleTrace(boolean debug) {
		super(debug);
	}

	@Override
	public void debug(String message) {
		if(debug) {
			System.out.println("DEBUG: " + message);
		}
	}

	@Override
	public void error(String message) {
		System.out.println("ERROR: " + message);
	}

}

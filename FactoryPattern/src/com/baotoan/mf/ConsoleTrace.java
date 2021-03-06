package com.baotoan.mf;

public class ConsoleTrace implements Trace {
	private boolean debug = true;
	
	@Override
	public void setDebug(boolean debug) {
		this.debug = debug;
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

package com.baotoan.absf;

public abstract class Trace {
	protected boolean debug;
	
	public Trace(boolean debug) {
		this.debug = debug;
	}
	
	public void setDebug(boolean debug) {
		this.debug = debug;
	}
	
	public abstract void debug(String message);
	public abstract void error(String message);
}

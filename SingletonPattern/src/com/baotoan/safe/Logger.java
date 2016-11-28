package com.baotoan.safe;

public class Logger {
	private static Logger INSTANCE = new Logger();
	private String className;
	
	private Logger() {
		this.className = "";
	}
	
	public static Logger getInstance() {
		return INSTANCE;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public void debug(String message) {
		System.out.println("DEBUG: " + className + ": " + message);
	}
}

package com.baotoan.absf;

public class Test {
	public static void main(String[] args) {
		Trace log = TraceFactory.getTrace(new FileTraceFactory(true));
		log.debug("This is debug message");
		log.error("This is error message");
	}
}

package com.baotoan.absf;

public class ConsoleTraceFactory implements TraceAbstractFactory {
	private boolean debug;
	
	public ConsoleTraceFactory(boolean debug) {
		this.debug = debug;
	}

	@Override
	public Trace getTrace() {
		return new ConsoleTrace(debug);
	}

}

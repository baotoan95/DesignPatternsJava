package com.baotoan.absf;

import java.io.IOException;

public class FileTraceFactory implements TraceAbstractFactory {
	private boolean debug;
	
	public FileTraceFactory(boolean debug) {
		this.debug = debug;
	}
	
	public Trace getTrace() {
		try {
			return new FileTrace(debug, "log.txt");
		} catch (IOException e) {
			e.printStackTrace();
			return new ConsoleTrace(debug);
		}
	}
}

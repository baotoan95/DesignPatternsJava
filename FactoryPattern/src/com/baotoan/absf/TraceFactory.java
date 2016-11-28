package com.baotoan.absf;

public class TraceFactory {

	public static Trace getTrace(TraceAbstractFactory trace) {
		return trace.getTrace();
	}

}

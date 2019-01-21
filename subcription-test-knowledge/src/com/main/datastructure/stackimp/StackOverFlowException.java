package com.main.datastructure.stackimp;

public class StackOverFlowException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public StackOverFlowException(String message) {
		super(message);
	}
	
	public StackOverFlowException(String message, Throwable cause) {
		super(message,cause);
	}

	@Override
	public String toString() {
		return "StackOverFlowException [toString()=" + super.toString() + "]";
	}
	
}

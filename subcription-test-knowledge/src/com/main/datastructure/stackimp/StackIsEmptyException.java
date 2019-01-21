package com.main.datastructure.stackimp;

public class StackIsEmptyException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public StackIsEmptyException(String message) {
		super(message);
	}
	
	public StackIsEmptyException(String message, Throwable cause) {
		super(message,cause);
	}

	@Override
	public String toString() {
		return "StackIsEmptyException [toString()=" + super.toString() + "]";
	}
	
}

package mypayroll.models;

public class PayrollException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public PayrollException (String anEmptyInput) {
		super(">>> Error: an input data is required.");
	}
	
	public PayrollException (int aNegativeInteger) {
		super(">>> Error: a positive integer input data is required.");
	}
	
	public PayrollException (double aNegativeDouble) {
		super(">>> Error: a positive double input data is required.");
	}
}

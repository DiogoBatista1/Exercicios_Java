package Exceptions;

public class BusinessExceptions extends RuntimeException {
	public static final long serialVersionUID = 1L;
	
	public BusinessExceptions(String msg) {
		super(msg);
	}
}

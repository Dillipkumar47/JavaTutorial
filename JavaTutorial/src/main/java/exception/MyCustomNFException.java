package exception;

public class MyCustomNFException extends Exception {
	
	public MyCustomNFException() {
		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		
		return "user has provided an invalid input";
	}

}

package exception;

public class NumberFromatExcepDemo {
	
	public int cube(String n) throws MyCustomNFException{
		int a=0;
		try {
			 a= Integer.parseInt(n);
			
		}
		catch(NumberFormatException e) {
			throw new MyCustomNFException();
		}
		return a * a * a;
	}
	public static void main(String[] args)  {
		NumberFromatExcepDemo tc = new NumberFromatExcepDemo();
		String num = "Hi";
		
			try {
				System.out.println(tc.cube(num));
			}
			catch(MyCustomNFException e) {
				System.out.println("inside Custom Exception");
				System.out.println(e.getMessage());
			}
			
	}

}



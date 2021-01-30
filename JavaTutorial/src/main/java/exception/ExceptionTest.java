package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		
		NullPointerExceptionDemo objNull = new NullPointerExceptionDemo();
		
		try {
			System.out.println("Sum of" +a +"  & "+b +" = "+objNull.add(a, b).intValue() );
		}
		catch(NullPointerException ne) {
			System.out.println(ne.getLocalizedMessage());
		}
		
		//ArithmeticExceptionDemo objAr=new ArithmeticExceptionDemo();
	
//		double a=4;
//		double b=0;
//		double res=objAr.divide(a, b);
//		System.out.println("Division of "+a +" & " +b+" is "+res);
//		
	}

}

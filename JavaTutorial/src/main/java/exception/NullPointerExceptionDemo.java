package exception;

public class NullPointerExceptionDemo {
	Integer sum = 0;
	public Integer add(int a, int b) {
		
		sum = a+b;
		sum=null;
		
		return sum;
	}

}

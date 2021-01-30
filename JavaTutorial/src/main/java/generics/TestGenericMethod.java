package generics;

public class TestGenericMethod {
	
	
	public <E> void printArray (E [] record) {
		
		for (E e:record) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {

		Integer[] arrInteger = { 10, 20, 30, 40, 50, 60 };
		Character[] arrChar = { 'I', 'N', 'F', 'O', 'S', 'Y', 'S' };
		Double[] arrDouble = { 100.1, 200.1, 300.1, 400.1, 500.1, 600.1 };
		TestGenericMethod tg = new TestGenericMethod();
		tg.printArray(arrInteger);
		tg.printArray(arrChar);
		tg.printArray(arrDouble);

	}

}

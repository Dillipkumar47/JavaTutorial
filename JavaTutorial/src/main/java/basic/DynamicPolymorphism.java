package basic;

public  class DynamicPolymorphism {
	
	public void show() {
		System.out.println("I am parent");
	}
	
	

}

class DP1 extends DynamicPolymorphism{
	public void show() {
		System.out.println("I am child 1");
	}
}

class DP2 extends DynamicPolymorphism{
	public void show() {
		System.out.println("I am child 2");
	}
}
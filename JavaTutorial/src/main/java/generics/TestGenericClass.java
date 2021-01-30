package generics;
public class TestGenericClass <E>{
	void show(E e) {
		System.out.println(e);
	}
	public static void main(String[] args) {
		IntRecord intObj=new IntRecord(10);
		TestGenericClass <IntRecord> genRecordInt= new TestGenericClass<IntRecord>();
		genRecordInt.show(intObj);
		StringRecord strObj=new StringRecord("Dillip");
		TestGenericClass <StringRecord> genRecordStr= new TestGenericClass<StringRecord>();
		genRecordStr.show(strObj);
	}
}
class IntRecord<Integer>{
	int someInt=0;
	public  IntRecord(int a) {
		this.someInt=a;
	}
	@Override
	public java.lang.String toString() {
		// TODO Auto-generated method stub
		return "Value is "+this.someInt;
	}
}
class StringRecord<String>{
	String smoeString;
	public StringRecord(String s) {
		this.smoeString=s;
	}
	@Override
	public java.lang.String toString() {
		// TODO Auto-generated method stub
		return "Value is - "+this.smoeString;
	}
}
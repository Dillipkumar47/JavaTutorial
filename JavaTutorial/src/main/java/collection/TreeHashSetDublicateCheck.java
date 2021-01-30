package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class TreeHashSetDublicateCheck{
	public static void main(String[] args) {
		Student st=new Student("Dillip",100);
		Student st1=new Student("Fillip",100);
		Set<Student> stTree=new HashSet<Student>();
		stTree.add(st);
		stTree.add(st1);
		for(Student ts:stTree) {
			System.out.println(ts);
			
		}
		
		
	}
}
 class Student{
	private String name;
	private int rollNumber;

        public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name = "+this.name+" Roll NUmber = "+this.rollNumber;
	}
	public boolean equals(Student obj) {
		// TODO Auto-generated method stub
		
		
		if(this==obj) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.rollNumber;
	}
}








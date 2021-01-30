package collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Subject> subs=new TreeSet<Subject>();
		subs.add(new Subject(10, "Maths"));
		subs.add(new Subject(15, "Geography"));
	
		System.out.println(subs);

	}

}

class Subject implements Comparable<Subject> {
    public int subjectId;
    public String subjectName;

  public Subject(int subjectId, String subjectName) {
       this.subjectName = subjectName;
      this.subjectId = subjectId;
   }

	public int compareTo(Subject sub) {
		// TODO Auto-generated method stub
		return this.subjectName.compareTo(sub.subjectName);
	}
	  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SubjectName = "+this.subjectName+ ": SubjectID = "+this.subjectId;
	}
  
}
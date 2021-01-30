package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortComparable {

	public static void main(String[] args) {
		ArrayList<Program> courses = new ArrayList<Program>();
		courses.add(new Program(103, "Sava"));
		courses.add(new Program(102, "Python"));
		Collections.sort(courses);
		System.out.println(courses);
		
	}
}
 class Program implements Comparable<Program> {
    public int programId;
    public String programName;
  public Program(int programId, String programName) {
       this.programId = programId;
      this.programName = programName;
   }
    public int compareTo(Program otherProgram) {
        return this.programName.compareTo(otherProgram.programName);
    }

  @Override
   public String toString() {
       return this.programId + ":" + this.programName;
    }
}

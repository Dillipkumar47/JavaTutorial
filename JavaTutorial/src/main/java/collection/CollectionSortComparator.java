package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSortComparator {

	public static void main(String[] args) {
		
		
		Set<Course> courses = new TreeSet(new Comparator<Course>() {

			public int compare(Course c1, Course c2) {
				return c1.CourseId-c2.CourseId;
			}
		});
		courses.add(new Course(103, "Java"));
		courses.add(new Course(102, "Python"));
		
		System.out.println(courses);
		
	}
}
class Course  {
    public int CourseId;
    public String CourseName;

  public Course(int CourseId, String CourseName) {
       this.CourseId = CourseId;
      this.CourseName = CourseName;
   }

  @Override
   public String toString() {
       return this.CourseId + ":" + this.CourseName;
    }


}

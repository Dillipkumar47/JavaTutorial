package serializeDeserialize;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import sun.rmi.server.DeserializationChecker;

public class ObjectSerialization {
	public static void main(String[] args) {
		int roll1=1000;
		String name1="Dillip";
		DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
		String dateStr="1990-12-13";
		Date dob1 = null;
		Set<Course> courses=new HashSet<Course>();
		courses.add(new Course("Java"));
		courses.add(new Course("Python"));
		try {
			 dob1=dateFormat.parse(dateStr);
			 Student st1=new Student(roll1, name1, dob1, courses);
			 FileOutputStream fileOut= new FileOutputStream(new File("./Resources/Student.bin"));
			 ObjectOutputStream objOut=new ObjectOutputStream(fileOut);
			 objOut.writeObject(st1);
			 System.out.println("Student data written successfully to the file");
			 
			 FileInputStream fileIn= new FileInputStream(new File("./Resources/Student.bin"));
			 ObjectInputStream objIn=new ObjectInputStream(fileIn);
			 Student dillip=(Student) objIn.readObject();
			 System.out.println(dillip);
			 
			 objOut.close();
			 fileOut.close();
			 
		} catch (ParseException e) {
			System.out.println("Could not parse input String as a date");
		} 
		catch(NotSerializableException e) {
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1753004074855913701L;
	int rollNo;
	String name;
	Date dob;
	Set<Course> courses;
	public Student(int rollNo,String name,Date dob, Set<Course> courses) {
		this.rollNo=rollNo;
		this.name=name;
		this.dob=dob;
		this.courses=courses;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Roll no - "+this.rollNo+"Name - "+this.name+"Dob - "+this.dob.toString()+" Courses - "+this.courses.toString()
;	}
}
class Course implements Serializable{
	String course;
	public Course(String course) {
		this.course=course;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.course;
	}
}
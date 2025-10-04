package collectionsDemoexample;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public void setAllStudents() {
		List<Student> student =new ArrayList();
		Student s1=new Student();
		
		s1.setName("Ashish");
		s1.setRollNo(10);
		s1.setCity("pune");
		
        Student s2=new Student();
		
		s2.setName("Ashish");
		s2.setRollNo(10);
		s2.setCity("pune");
		
		
		student.add(s1);
		student.add(s2);
		
		
	}
	
	public void getAllStudents() {
//		System.out.println(s1.getName());
//		System.out.println(s1.getRollNo());
//		System.out.println(s1.getCity());
	}
	
	

}

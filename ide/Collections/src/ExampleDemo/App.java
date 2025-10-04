package ExampleDemo;
import java.util.*;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
public class App {
	Scanner sc=new Scanner(System.in);
	List<Student> students =new ArrayList<Student>();
	public void setAllStudents() {
		boolean addMore=true;
		while(addMore) {
			System.out.println("Enter Roll NO: ");
			int rollNo=sc.nextInt();
			System.out.println("Enter Name: ");
			String name=sc.next();
			System.out.println("Enter city: ");
			String city=sc.next();
			System.out.println("Enter Contact: ");
			int contact=sc.nextInt();
			
			
			Student st=new Student();
			students.add(st);
			System.out.println("Press 1 for add more");
			
			if(1!=sc.nextInt()) {
				addMore=false;
				System.out.println("Student Details added");
			}
		}
	}
		
		public void getAllStudents() {
			Iterator<Student> st=Student.iterator();
			while(st.hasNext()) {
				System.out.println(st.getRollNo);
				System.out.println(st.getName);
				System.out.println(st.getContact);
				System.out.println(st.getCity);
			}
		}
	}



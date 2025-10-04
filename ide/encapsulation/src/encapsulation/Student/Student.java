package encapsulation.Student;

public class Student {
	int rollNo=111;
	String name="Rutuja";
	
	public static void main(String[] args) {
		Student st=new Student();
		st.rollNo=111;
		st.name="Rutuja";
		
		
		Student st1=new Student();
		st1.rollNo=112;
		st1.name="asdd";
		
		 System.out.println(st.rollNo);
		 System.out.println(st1.name);
		 System.out.println(st.name);
		 System.out.println(st1.rollNo);
		
		
		
	}

}

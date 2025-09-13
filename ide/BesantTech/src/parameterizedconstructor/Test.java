package parameterizedconstructor;



public class Test {
	
	public static void main(String[] args) {
		Student st=new Student();
		st.setName("Ashish");
		st.setRollNo(1);
		st.setCity("Pakistan");
		
		
		Student st1=new Student();
		st1.setName("misal");
		st1.setRollNo(2);
		st1.setCity("india");
		
		
		//using parameterized constructor
		Student st3=new Student(100,"Akash","Sangola");
		System.out.println(st3.getRollNo());
		System.out.println(st3.getName());
		System.out.println(st3.getCity());
		
	}

}

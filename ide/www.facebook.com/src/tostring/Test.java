package tostring;

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
		
		//this will print the address of an object 
//		System.out.println(st);
//		System.out.println(st1);
		
		//using toString method (its object class method) we can print the details of function
		System.out.println(st);
		System.out.println(st1);
	}

}

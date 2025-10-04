package collectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		//to overcome the arrays limitations ArrayList 
		ArrayList stud_data=new ArrayList();
		stud_data.add(2334);
		stud_data.add(34.4f);
		stud_data.add("Rutuja");
		stud_data.add(true);
		System.out.println(stud_data);
		
		
		ArrayList stud1=new ArrayList();
		for(int i=0;i<100;i++) {
			stud1.add(i);
		}
	    System.out.println(stud1);
	}

}

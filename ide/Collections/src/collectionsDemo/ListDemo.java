package collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		//in this ArrayList is an parent of List 
		//the following List stores only integer data type 
		List<Integer> marks=new ArrayList<>();//object type data
		
		//<Integer>  present in wrapper class so conversion of wrapper -->object type
		marks.add(123);//generic collections called bcz when we are using same type data as declared 
		marks.add(233);
		//marks.add("rutuja"); //non generic collections  not similar to declared type  
		System.out.println(marks);
	}

}

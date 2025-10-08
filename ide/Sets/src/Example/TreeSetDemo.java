package Example;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//tree set  Constructs a new, empty tree set, sorted according to the natural ordering of its elements
		Set<Integer> val=new TreeSet<Integer>();
		val.add(23);
		val.add(2);
//		val.add(null);
		val.add(2);
		System.out.println(val);//duplicate not allowed 
		//null values are not allowed
		
		
		Set<String> val1=new TreeSet<String>();
		val1.add("rutuja");//ascending order
		val1.add("abc");
		val1.add("rutuja");//duplicates not allowed
//		val1.add(null);
		System.out.println(val1);
	}

}

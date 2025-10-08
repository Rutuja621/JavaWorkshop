package HasgSetDemo;

import java.util.HashSet;
import java.util.Set;

public class HashsetStr {
	public static void main(String[] args) {
		Set<String> names=new HashSet<String>();
		names.add("rutuja");
		names.add("misal");
		names.add("rk");
		
		System.out.println(names);
		
		for(String name: names) {
			System.out.println(name+" Hash Code: "+name.hashCode());
		}
		
	}
	
	

}

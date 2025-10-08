package Example;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Set<Integer> id=new LinkedHashSet<Integer>();
		id.add(244);
		id.add(3);
		id.add(3);
		id.add(22);
		id.add(60);
		id.add(null);
		id.add(null);
		System.out.println(id); //duplicate values not allowed 
		
		
		
		Set<String> name=new LinkedHashSet<String>();
		name.add("rutuja");
		name.add("misal");
		name.add("rk");
		name.add(null);
		System.out.println(name);
		
		for(String name1 : name) {
			System.out.println(name1+" Hash Code "+name1.hashCode());
		}
	}

}

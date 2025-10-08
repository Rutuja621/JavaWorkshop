package vector.dao;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>();//legacy (old method)
		
		vector.add(21);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		for(int i=0;i<=9;i++) {
			vector.add(i);
		}
		System.out.println(vector);
		vector.add(23);
		System.out.println(vector.size());
		System.out.println(vector.capacity());//increases double of capacity when we add an extra element
		
		for(int i=0;i<20;i++) {
			vector.add(i);
		}
		System.out.println(vector);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
	}

}

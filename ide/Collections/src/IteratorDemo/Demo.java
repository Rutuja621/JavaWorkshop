package IteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		List<Integer> allList=new ArrayList<Integer>();
		
		for(int i=0;i<100;i++) {
			allList.add(i);
		}
		
		System.out.println(allList);
		/*
		 * An iterator over a collection. Iterator takes the place of Enumeration in the Java Collections Framework. Iteratorsdiffer from enumerations in two ways: 
            • Iterators allow the caller to remove elements from the underlying collection during the iteration with well-definedsemantics. 
            • Method names have been improved

		 */
		Iterator<Integer> itr=allList.iterator();
		//loop runs till 99
		while(itr.hasNext()) {//true if the iteration has more elements
			System.out.println(itr.next());//Returns the next element in the iteration.
		}
		
		
		
		ListIterator<Integer> listIterator=allList.listIterator();
		System.out.println("Forward");
		while (listIterator.hasNext()) {
			
			System.out.println(listIterator.next());
			
		}
		System.out.println("Prevoius");
		while (listIterator.hasPrevious()) {
			
			System.out.println(listIterator.previous());
			
		}
	}

}

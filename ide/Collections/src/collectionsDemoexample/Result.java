package collectionsDemoexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {
	public static void main(String[] args) {
		List<Integer> data=new ArrayList<>();
		
		data.add(2344);
		data.add(23);
		data.add(3455);
		data.add(23344);
		
		 
	    //true if the specified object is equal to this list
	     System.out.println(data.equals(data));
	     
		System.out.println(data);
		data.set(2, 000);//it will set 0 value at index 2
		
		System.out.println(data);
		System.out.println(data.size());//prints the size of an data
		
		//data.clear();//it will remove/clear all the data from the list
		System.out.println(data);
		
		System.out.println(data.contains(23));//it will return true if the number in list contains 123 data otherwise false
		
		 data.add(0, 2); // Adds 2 at the beginning (index 0)
	     System.out.println(data);
	     data.add(1); // This still adds to the end, as it's the standard add method
	     System.out.println(data);
	     
	     
	     //Returns true if this list contains all of the elements of thespecified collection.
	     System.out.println(data.containsAll(data));
	    
	     // Returns the element at the specified position in this list.
	     System.out.println(data.get(0));
	     
	     //Removes the first occurrence of the specified element from this list, if it is present. 
	    System.out.println(data.remove(2));
	    
	    System.out.println(data);
	    
	    
//	    data.clear();
//	    System.out.println(data);
	    // Returns true if this list contains no elements.
	    System.out.println(data.isEmpty());
	    System.out.println(data);
	    
	    //Returns the index of the last occurrence of the specified elementin this list, or -1 if this list does not contain the element
	    System.out.println(data.lastIndexOf(4));
	    System.out.println(data);
	    
	 // Example with addAll and sorting
        ArrayList<Integer> otherData = new ArrayList<>();
        otherData.add(50);
        otherData.add(5);
        otherData.add(100);
        
        data.addAll(otherData); // Adds all elements from otherData
        System.out.println("After add All: " + data); // Output: [50, 5, 100]

        Collections.sort(data); // Sorts the ArrayList
        System.out.println("After sorting: " + data); // Output: [5, 50, 100]
	}
	
	
	
	

}

package Hashing;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
//		in hash duplicates are not allowed
		HashMap<String,Integer> hm=new HashMap<>();
		// insertion constant time operation O(1)
		hm.put("india", 234);
		hm.put("rusia", 500);
		hm.put("america", 234);
		hm.put(null, null);//null values are allowed
		System.out.println(hm);
		
		//get operation is also O(1)
		//Returns the value to which the specified key is mapped,or null if this map contains no mapping for the key. 
		int population=hm.get("india");
		System.out.println(population);
		System.out.println(hm.get("Indonesia"));//if key not exists null is returned
		
		//contains key  O(1) 
		
		System.out.println(hm.containsKey("india"));//true
		System.out.println(hm.containsKey("indo"));//false
		
		//remove O(1)
		
//		System.out.println(hm.remove("america"));
//		System.out.println(hm);
//		System.out.println(hm.remove("indo"));
		
		
		//size
		
		System.out.println(hm.size());
		
		
//		//isempty
//		
//		System.out.println(hm.isEmpty());
//		
//		hm.clear();
//		System.out.println(hm);
//		
//		System.out.println(hm.isEmpty());
		
		
		
		
		
		///hashsets
		
		Set<String> keys=hm.keySet();
		System.out.println(keys);
		
		
		for(String key1:keys) {
			System.out.println("Key: "+key1+",values: "+hm.get(key1));
		}
			
	}

}

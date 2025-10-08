package HasgSetDemo;
import java.util.Set;
import java.util.HashSet;
public class HashSet1 {
	public static void main(String[] args) {
		Set<Integer> nums=new HashSet<Integer>();
		nums.add(30);
		nums.add(10);
		nums.add(20);
		nums.add(40);
		nums.add(35);
		nums.add(5);
		nums.add(10);
		nums.add(null);
		System.out.println(nums);//based hash values output is printed 
		//duplicates are not allowed
	}

}

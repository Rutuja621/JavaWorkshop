package Queue.dao;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDao {
	public static void main(String[] args) {
		Queue<Integer> nums=new PriorityQueue<>();
		nums.add(30);
		nums.add(10);
		nums.add(20);
		nums.add(40);
		nums.add(35);
		nums.add(5);
//		nums.add(null);
		System.out.println(nums.peek());
		System.out.println(nums);
		
	}

}

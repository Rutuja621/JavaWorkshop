package Queue.dao;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		//Constructs an empty array deque with an initial capacitysufficient to hold 16 elements.

		ArrayDeque<Integer> data=new ArrayDeque<Integer>();
		//Arraydeques have no capacity restrictions
		//faster than Stack when used as a stack, and faster than LinkedListwhen used as a queue.
		data.add(37);
		data.addFirst(63);
		data.addLast(438);
		System.out.println(data);
		data.removeFirst();
		System.out.println(data);
		
		
	}

}
//Deque double ended queue
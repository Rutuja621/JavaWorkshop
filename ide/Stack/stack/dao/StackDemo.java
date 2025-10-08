package stack.dao;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();//(LIFO)
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(50);
		st.add(60);
		st.add(null);
		System.out.println(st);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st);
		
	}

}

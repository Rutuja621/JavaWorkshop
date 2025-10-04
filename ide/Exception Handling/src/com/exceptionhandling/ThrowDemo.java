package com.exceptionhandling;
import java.util.*;
public class ThrowDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println("Voter..");
		}else {
			throw new AgeNotValidException();
		}
	}

}




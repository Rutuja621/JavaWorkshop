package com.exceptionhandling;

public class Example {
	public static void main(String[] args) {
		
		
		try {
			String str="Rutuja";
			System.out.println(str.charAt(6));
			
		} catch (StringIndexOutOfBoundsException e) {
			// TODO: it can be handled using Exception ,StringIndexOutOfBoundsException,IndexOutOfBoundsException
			System.out.println("At this no character found");
		}
	}

}

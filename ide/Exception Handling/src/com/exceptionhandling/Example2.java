package com.exceptionhandling;

public class Example2 {
	public static void main(String[] args) {
//		try {
//			String r="Rutuja";
//			int b=Integer.parseInt(r);
//			System.out.println(r);
//		} 
//		//System.out.println();
//		catch (NumberFormatException e) {
//			// TODO: handle exception
//			System.out.println("Error");
//		}
		
		//we can use single try and multiple catch
		try {
			int a=0;
			int b=0;
			System.out.println(a/b);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Cant divide by 0");
			
		}catch(NullPointerException e) {
			System.out.println("Handled Null");
		}catch(ArithmeticException e) {
			System.out.println("Handled 2");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Handled 3");
		}
		
		//first parent and then child exception is not allowed 
		//because we resolve the error in first parent exception
		
		//for example
		
		try {
			int a=0;
			int b=0;
			System.out.println(a/b);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cant divide by 0");
		}
		//this will show an error
//		catch(RuntimeException e) {
//			System.out.println("Handled by runtime exception");
//		}catch(ArithmeticException a) {
//			System.out.println("handled by Arithmetic Exception");
//		}
		
		
	}

}

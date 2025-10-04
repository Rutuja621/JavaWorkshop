package com.exceptionhandling;

public class Example3 {
	public static void main(String[] args) {
		try {
			String str="Rutuja";
			System.out.println(str.charAt(6));
		}catch (StringIndexOutOfBoundsException e) {
		// TODO: handle exception
			System.out.println("Handled by child");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Handled by parent");
		}finally {//always runs even if there is exception or not
			System.out.println("Inside finally");
		}
	}

}

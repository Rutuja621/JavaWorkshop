package Interfaces;

public interface Animal {
	public void m1();
	
	//public void m2(){}   not allowed
	
	public static void getM3() {
		System.out.println("Static funcion");
	}
	             
	public static void main(String[] args) {
	  Animal .getM3();
	}

}

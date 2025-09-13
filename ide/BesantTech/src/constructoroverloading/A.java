package constructoroverloading;

public class A {
	public A() {
		System.out.println("A");
	}
	
	public A(int a) {//parameterized constructor
		System.out.println("B");
	}
	
	public A(String c) {
		System.out.println("String");
	}
	
	
	public static void main(String[] args) {
		A obj=new A("Avni");
	}

}

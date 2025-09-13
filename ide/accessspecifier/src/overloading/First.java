package overloading;

public class First {
	public void m1(String a) {
		System.out.println("String");
	}
	
	public void m1(String a,int b) {
		System.out.println("String,int");
	}
	
	public void m1(float a) {
		System.out.println("float");
	}
	
	public void m1(int a,int b,int c) {
		System.out.println("3 int");
	}

}

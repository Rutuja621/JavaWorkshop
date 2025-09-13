package finalkeyword;

public class Test extends B{
	//we cant write same function name because m1 is an final function in B class
	//we can't override the function
//	public void m1() {
//		System.out.println("Final Function");
//	}
//	
	public void m() {
		System.out.println("Non final");
	}
	
	public static void main(String[] args) {
		
	}

}

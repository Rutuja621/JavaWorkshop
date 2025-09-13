package abstraction;

public abstract class A {
	A(){
		System.out.println("constrctor abstraction");
	}
	
	
	public static void m1(){
		System.out.println("hello");
	}
	
//	public abstract static void m1(){
//		System.out.println("hello");
//	}  we cant create abstract and static together beacause static doesn't override

}

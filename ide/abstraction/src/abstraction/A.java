package abstraction;
//cannot create an instance(object) of abstract class
//we can create constructor of an abstract class
public abstract class A {
	//encapulation wrapup function and related data or helps to implement data hinding
	//hiding all the unecessary details and showing only the important parts to the user
	//abstraction shows only important data hindes unimportant data
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

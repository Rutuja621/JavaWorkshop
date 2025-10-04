package SuperKeyword.com;

public class SuperDemo {
	//super keywod is used to refer the immediate parent class object
	public static void main(String[] args) {
		Horse h=new Horse();
		System.out.println(h.color);
		
		
		
	}
/*use of super keyword
 * -to access the parent class properties
 * -to access the parent class functions
 * -to access the parent's constructor
 */
}

class Animal{
	String color;
	Animal(){
		System.out.println("Animal constructor is called");
	}
}

class Horse extends Animal {
	Horse(){
		//this super will call the immediate parent class constructor first
		//if we didn't call the super keyword bydefault super keyword is created and first parent class constructor is called
		//super();
		
		super.color="brown";//this will set the parent class color to brown
		System.out.println("Horse constructor is called");
	}
}

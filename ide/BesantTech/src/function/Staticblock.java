package function;

public class Staticblock {
	{//non static block  {}
	System.out.println("Inside non static block");
	}
//	static {
//		System.out.println("Inside static block");
//	}
	
//	public static void main(String[] args) {
//		System.out.println("inside main");
//	}
	//static block is printed before the main function
	
	
	
	
/*	static {
		System.out.println("Inside static block 1");
	}
	
	static {
		System.out.println("Inside static block");
	}
	
	static {
		System.out.println("Inside static block 2");
	}*/
	
	public static void main(String[] args) {
		System.out.println("inside main");
		Staticblock blk=new Staticblock();
	}
}	



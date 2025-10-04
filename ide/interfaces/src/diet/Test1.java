package diet;

public class Test1 {
	
	//for the Diet interface
	public static void main(String[] args) {
		Diet n=new Nonveg();
		//from the Diet interface
		System.out.println(n.getDiet());
		
		//from the Sports interface
		System.out.println(n.getName());
	}

}

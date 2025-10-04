package example2.com;

public class Example2 {
	public static void main(String[] args) {
		Horse h=new Horse();
		h.walk();
		
	}

}

interface Animal{
	void walk();
}

class Horse implements Animal{
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("walks on four legs");
	}
}

class Chicken implements Animal{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("walks on two legs");
	}
	
}
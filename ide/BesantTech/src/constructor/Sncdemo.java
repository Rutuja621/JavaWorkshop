package constructor;

public class Sncdemo {
	
	{
		System.out.println("Non static");
	}
	
	static {
		System.out.println("Static");
	}
	public static void main(String[] args) {
		Sncdemo demo=new Sncdemo();
	}
	Sncdemo(){
		System.out.println("Constructor");
	}
	
	

}

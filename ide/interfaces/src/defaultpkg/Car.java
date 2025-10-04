package defaultpkg;

public interface Car {
	//nonstatic method 
	//for nonstatic method we can't give a data like default and static method
	public void getName();
		
	
	//we can give directly data to the this 2 methods and directl call  them
	//static method
	public static void getFeatures() {
		System.out.println("5 star safety");
	}
	//default method
	default void getFuelType() {
		System.out.println("Petrol");
	}

}

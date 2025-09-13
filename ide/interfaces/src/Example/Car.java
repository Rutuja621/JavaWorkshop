package Example;

public interface Car {
	
	public static void getFeatures() {
		System.out.println("5* ");
		
	}
	
	
	default void getName() {
		System.out.println("Tesla");
	}
	
	public void getGear();
	
	public void getN(String a);
	
	public void getP(int a , String b);
	public void getG(float b);

}

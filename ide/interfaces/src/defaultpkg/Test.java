package defaultpkg;

public class Test {
	public static void main(String[] args) {
		Car sf=new Safari();
		sf.getName();
		
		//default mehtod  we don't need override we can directly call this by implementing interface to a class
		sf.getFuelType();
		
		//static function by using class name we can directly call the static method
		
		Car.getFeatures();
	}

}

package defaultpkg;

public class Test {
	public static void main(String[] args) {
		Car sf=new Safari();
		sf.getName();
		//default we don't need override
		sf.getFuelType();
		
		//static function
		
		Car.getFeatures();
	}

}

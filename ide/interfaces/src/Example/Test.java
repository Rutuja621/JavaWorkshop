package Example;

public class Test {
	public static void main(String[] args) {
		//we can use annonomous only for unimplemented function i.e non static function
		Car cr=new Car() {

			@Override
			public void getGear() {
				System.out.println("gear");
				
			}

			@Override
			public void getN(String a) {
				System.out.println(a);
				
			}

			@Override
			public void getP(int a, String b) {
				System.out.println(a);
				System.out.println(b);
			}

			@Override
			public void getG(float b) {
				System.out.println(b);
				
			}
		};
		cr.getGear();
		cr.getN("ABC");
		cr.getG((float) 12.4);
		cr.getP(2, "hello");
		
		
//		cr.getName();
//		Car.getFeatures();
		
		
		
	}

}

package annonomousinterface;

public class Test {
	public static void main(String[] args) {
		//annonomous method to override the function in interface
		Shape ch=new Shape() {
			public void draw() {
				System.out.println("triangle");
			}
		};
		ch.draw();
	}

}

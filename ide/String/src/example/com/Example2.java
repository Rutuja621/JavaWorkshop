package example.com;

public class Example2 {
	public static final int I=1;
	public static final int V=5;
	public static final int X=10;
	public static final int L=50;
	public static final int C=100;
	public static final int D=500;
	public static final int M=1000;

	public static int addVI() {
		return V + I;
	}
	public static int subtractVI() {
		return V - I;
	}
	public static int multiplactionMv() {
		return M*V;
	}
	public static  int divisionLX() {
		return L/X;
	}
	public static  int moduloLX() {
		return L%X;
		
	}
	
public static String getString(String str) {
		
		String upperCaseStr=str.toUpperCase();
		String result=upperCaseStr.replaceAll("\\d","_");
		
		
		return result;	
		
		
	}
	public static void main(String[] args) {
		
		
		
		//I=1
		
		System.out.println(addVI());
		System.out.println(subtractVI());
		System.out.println(multiplactionMv());
		System.out.println(divisionLX());
		System.out.println(moduloLX());
		
	
	}

	


}

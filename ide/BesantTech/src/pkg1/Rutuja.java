package pkg1;

public class Rutuja {
	public static void main(String[] args) {
		//ternary 
		
		int a=10;
		int b=50;
		int c=30;
		
		//biggest number
		
	    int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println(largest);
		
		
		/*if(a>b) {
			System.out.println("A is greater");
		}else {
			System.out.println("B is greater");
		}*/
		
		if(a==b) {
			System.out.println("A is greater");
		}else if(a>b) {
			System.out.println("B is greater");
		}else {
			System.out.println("D");
		}
		
		
		
		
		
		
	}
	
	
}

package pkg1;

public class Marks {
	public static void main(String[] args) {
		int ch=3;
		switch(ch) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
			
		default:
			System.out.println("another value");
			//duplicate values are not allowed in switch case
		}
		
		//for loop
		
		for(int i=0;i<6;i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		
		
	
	
	}

}

package arraydemo;

public class Declarearr {
	public static void main(String[] args) {
		//declare an array
		//first way
		int a[]= {10,20,30,40};
		System.out.println(a[0]);
		
		int mark=10;
		int mark1=20;
		
		//second way
		
		int marks[]=new int[5];
		marks[0]=10;
		marks[1]=20;
		marks[2]=30;
		marks[3]=40;
		marks[4]=50;
		
		System.out.println(marks[2]);
		
	}

}

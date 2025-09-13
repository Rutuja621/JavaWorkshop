package arraydemo;

public class Example {
	
	//if number is present in array then print index of number else print -1
	public static int findRollNumber(int[] rolls,int rollNo) {
		for(int i=0;i<rolls.length;i++) {
			if( rollNo == rolls[i]) {
				System.out.println(rolls[i]);
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int rolls[]={10,4,6,3,19};
		System.out.println(Example.findRollNumber(rolls,10));
		
	}

}

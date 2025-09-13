package StringDeclare;

public class Operonstr {
	
	public static void main(String[] args) {
		String a="Mumbai";
		String b="Mumbai";
		//.equals checks only contents of a string 
		System.out.println(a.equals(b));
		
		//== this checks the memory of an both string 
		String s=new String("mumbai");
		System.out.println(a==s);
	}

}

package String.demo.com;

public class StringCompare {
	public static void main(String[] args) {
		//if we create an variable memory is allocated to this And if create same variable again 
		//instead of creating new this new variable points the existing variable this is called as interning
		String s1="Rutuja";
		String s2="Rutuja";
		//this called as turning
		String s3=new String("Rutuja");
		
		//== checks in object level if this are equal
		//check value only
		if(s1==s2) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("String are not equal");
		}
		
//		if(s1==s3) {
//			System.out.println("Strings are equal");
//		}else {
//			System.out.println("String are not equal");
//		}
		
		//equal function checks the actual string not the value
		if(s1.equals(s3)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}
		
	}
	

}
